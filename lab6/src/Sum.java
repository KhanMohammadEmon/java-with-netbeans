import java.security.InvalidParameterException;
import java.util.Scanner;

public class Sum {
    //ans no 7(1)
    public static void main(String[] args) {
        int a ;
        int b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            if(a<0||b<0)
            {
                throw new InvalidParameterException();
            }
            else
            {
                System.out.println("Sum is :"+(a+b));
            }
        }
        catch (Exception e)
        {
            System.out.println("Any of the input is a negative number");
        }
    }
}
