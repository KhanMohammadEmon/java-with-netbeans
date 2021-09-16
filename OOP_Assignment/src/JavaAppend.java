import java.io.*;
import java.util.Scanner;

public class JavaAppend {
    public void WriteAppend ()
    {
        Scanner src = new Scanner(System.in);

        File my_file = new File("F:\\java with netbeans\\OOP_Assignment\\src","My_Doc.txt");
    try
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter(my_file,true));
        System.out.println("Write Here : ");
        String write = src.nextLine();
        bw.write(write);
        bw.newLine();
        System.out.println("Append successfully!");
        bw.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    public static void main(String[] args) {
        JavaAppend ja = new JavaAppend();
        ja.WriteAppend();
    }
}
