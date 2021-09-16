import java.io.*;

public class JavaClass18 {
    public  void WriteFile() {
        String str = "United International University";
        File my_file = new File("F:\\java with netbeans\\JavaClass18","My_Doc.txt");
        try
        {
            PrintWriter out = new PrintWriter(new FileWriter(my_file));
            out.println(str);
            out.close();
        } catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void readFile() throws FileNotFoundException {
        File my_file = new File("F:\\java with netbeans\\JavaClass18","My_Doc.txt");
        try {
            BufferedReader in = new BufferedReader(new FileReader(my_file));
            String str = in.readLine();
            while (str != null) {
                System.out.println("Read : " + str);
                str = in.readLine();
            }
            in.close();
        } catch(Exception e)
        {
            System.out.println(e);
        }

    }
    public static void main(String[] args)  {
        JavaClass18 j1 = new JavaClass18();
        j1.WriteFile();
        j1.readFile();
    }
}
