import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1Extra {
    public static  int checker(int num) throws InputMismatchException
    {
        if(num>100)
        {
            throw new InputMismatchException();
        }
        else
            return num;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num1 = src.nextInt();
        System.out.println();
        System.out.print("Enter 2nd Number : ");
        int num2 = src.nextInt();
        int x =0 ,y = 0;

        try
        {
         x = checker(num1) ;
        }
        catch (InputMismatchException e)
        {
            System.out.println("1st Exception is : "+e);
            num1 = num1/100;
        }
        try
        {
         x = checker(num2) ;
        }
        catch (InputMismatchException e)
        {
            System.out.println("2nd Exception is : "+e);
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
