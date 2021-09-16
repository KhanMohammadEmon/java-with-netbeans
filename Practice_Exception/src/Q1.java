import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int num1 =0,num2 = 0;

        try
        {
            System.out.print("Enter 1st Number : ");
            num1 = src.nextInt();
            if(num1>100)
            {

            }
            else
                num1 = num1;
        }
        catch (InputMismatchException e)
        {
            System.out.println("Exception is : "+e);
            num1 = num1/100;
        }

        try
        {
            System.out.print("Enter 2nd Number : ");
            num2 = src.nextInt();
            if(num2>100)
            {

            }
            else
                num2 = num2;

        }
        catch (InputMismatchException e)
        {
            System.out.println("Exception is : "+e);
            num2 = num2/100;
        }

        if (num1>num2)
        {
            System.out.println("Greater number is : "+num1);
        }
        else
        {
            System.out.println("Greater number is : "+num2);
        }
    }
}
