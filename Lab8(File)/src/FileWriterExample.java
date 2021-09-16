import java.io.*;
import java.util.Scanner;
public class FileWriterExample {
    public static void main(String[] args) {
        File file = new File("F:\\java with netbeans\\Lab8(File)\\src","hello.txt");
        try(BufferedWriter br = new BufferedWriter(new FileWriter(file,true)))
        {
            Scanner src = new Scanner(System.in);
            String new_line = src.nextLine();
           br.write(new_line);
           br.newLine();
            System.out.println("Write successfully!");
           br.close();
        }
        catch (Exception e){
        e.printStackTrace();}
    }
}
