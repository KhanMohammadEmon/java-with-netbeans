import java.util.InputMismatchException;
import java.util.Scanner;

public class Qus1 {

    public static void main(String[] args) {
        int first=0,second=0,quotient1=0,quotient2=0;
        Scanner input=new Scanner(System.in);

        try {
            System.out.println("Enter Value of First:");
            first=input.nextInt();
            System.out.println("Enter Value of Second:");
            second=input.nextInt();

            if (first>100){

                quotient1=first/100;
                System.out.println("Result of Divition:"+quotient1);


            }else if (second>100){

                quotient2=second/100;
                System.out.println("Result of Divition:"+quotient2);
            }

            else{
                System.out.println("Small");
            }

        }catch (InputMismatchException exception){
            System.out.println(exception);
            System.out.println("Please Enter integer");
        }
    }
}