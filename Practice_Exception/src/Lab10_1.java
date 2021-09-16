import java.util.Scanner;

public class Lab10_1 {
    public static void main(String[] args) {
        int n;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = src.nextInt();
        System.out.println("");
        System.out.println("You entered "+n+" number");
        try {

            int a1[] = new int[n];
            System.out.println("First element : "+a1[0]);
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println("Problem is : "+e);
        }
        finally {
            System.out.println("Thank You For Trying!");
        }
    }
}
