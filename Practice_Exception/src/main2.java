import java.util.InputMismatchException;
import java.util.Scanner;

class Main{
    public static int testMethod(int number) throws InputMismatchException{
        if(number <= 100) return number;
        else throw new InputMismatchException();
    }

    public static void main (String[] args) {
        int numberOne = new Scanner(System.in).nextInt();
        int numberTwo = new Scanner(System.in).nextInt();

        int n1 = 0, n2 = 0;

        try {
            n1 = testMethod(numberOne);
        } catch (InputMismatchException e){
            System.out.println("Number 1 throws Exception");
        }

        try{
            n2 = testMethod(numberTwo);
        } catch (InputMismatchException e){
            System.out.println("Number 2 throws Exception");
            n2 = numberTwo/100;
        }

        if(n1 > n2) System.out.println(n1 + " is greater");
        else System.out.println(n2 + " is greater");
    }
}