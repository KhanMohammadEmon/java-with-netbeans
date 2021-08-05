import java.util.Scanner;

public class JavaArray {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double []array = new double[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = src.nextDouble();

        }
        System.out.println("Reverse array Print : ");
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        double sum = 0;
        System.out.println("print Avg last 4 elements :");
        for (int i = array.length-1; i>0 ;i--) {

            sum = sum+ array[i];
        }

         double avg = sum/4;
        System.out.println(avg);
    }
}
