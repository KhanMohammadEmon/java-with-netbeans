import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws FileNotFoundException {
       try{
           //Creating File reader obj with absolute path
           FileReader fr = new FileReader("F:\\java with netbeans\\Lab8(File)\\src\\hello.txt");
          //reading the file content
           int i ;
           while((i = fr.read())!= -1)
           {
               System.out.print((char)i);
               //System.out.println((char)i);
           }
       }
       catch (FileNotFoundException e)
       {
           System.out.println("File not found!At first create a file. "+e);
       } catch (IOException e) {
           e.printStackTrace();
       }

    }
}
