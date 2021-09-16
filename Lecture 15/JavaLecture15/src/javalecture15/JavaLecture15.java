
package javalecture15;
import java.io.*;
public class JavaLecture15 {
    public static void main(String[] args) {
      String str = "United International University";
        File my_file = new File("F:\\java with netbeans\\Lecture 15\\JavaLecture15","My_Doc");
    try
    {
        PrintWriter out = new PrintWriter(new FileWriter(my_file));
    out.println(str);
        out.close();
    }
    catch (IOException e)
    {
        System.out.println(e);
    }
    }
}
