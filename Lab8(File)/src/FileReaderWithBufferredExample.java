import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderWithBufferredExample {
    public static void main(String[] args) {
        //FileReader fr = new FileReader("F:\\java with netbeans\\Lab8(File)\\src\\hello.txt");
        //BufferedReader br = new BufferedReader(fr);
        try(BufferedReader br = new BufferedReader(new FileReader("hello2.txt")))
        {
            String line;
            // reading the file content
            while ((line = br.readLine())!= null)
            {
                System.out.print(line);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
