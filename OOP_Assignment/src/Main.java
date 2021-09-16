import java.io.*;
import java.util.Scanner;

public class Main {
    public  void WriteFile() {
        Scanner src = new Scanner(System.in);
        String str = src.nextLine();
        File my_file = new File("F:\\java with netbeans\\OOP_Assignment","My_Doc.txt");
        try
        {
            PrintWriter out = new PrintWriter(new FileWriter(my_file,true));
            out.println(str);
            out.close();
        } catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public void readFile() throws FileNotFoundException {
        File my_file = new File("F:\\java with netbeans\\OOP_Assignment","My_Doc.txt");
        try {
            BufferedReader in = new BufferedReader(new FileReader(my_file));
            String str = in.readLine();
            System.out.println("Output From Txt File  :");
            while (str != null) {
                System.out.println(str);
                str = in.readLine();
            }
            in.close();
        } catch(Exception e)
        {
            System.out.println(e);
        }

    }

    public static void main(String[] args)  {
       Main j1 = new Main();
        j1.WriteFile();
        try {
            j1.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
