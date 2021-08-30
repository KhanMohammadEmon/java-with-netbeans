import java.util.Scanner;
public class U_2_6_1 {
    public static void main(String[] args) {
        ///find prime number
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a int number: ");
        int n = sc.nextInt();
        for (int i = 2; i <=n/2 ; i++) {
            if(n%i==0)
            {
               flag = 1;
               break;
            }
        }
        if(flag==1||n==0||n==1)
        {
            System.out.println(n+" number is not a prime number.");
        }
        else
        {
            System.out.println(n+" number is a prime number.");
        }
    }
}
