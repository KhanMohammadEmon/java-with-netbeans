import java.util.Scanner;

public class Q2 {
    public static int testMethod(int num) throws IllegalParameterException
    {
       if (num<0 || num % 3 ==0)
        throw new IllegalParameterException();
    else
        return num;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int number = src.nextInt();
        try {
            testMethod(number);
        } catch (IllegalParameterException e) {
            e.printStackTrace();
        }
        System.out.println("Number is : "+number);
    }

    private static class IllegalParameterException extends Exception {

    }
}
