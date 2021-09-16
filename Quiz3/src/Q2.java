import java.util.Scanner;

public class Q2 {
    public static int testMethod(int num) throws IllegalParameterException
    {
        if (num<0)
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
            System.out.println("Exception is : "+e);
        }
        if(number%3==0)
        {
            System.out.println(number+" number is  multiple of 3");
        }
        else
        System.out.println("Number is : "+number);
    }

    private static class IllegalParameterException extends Exception {

    }
}
