public class U_2_5_1 {
    public static void main(String[] args) {
       int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i+(i-1); j++) {
                if(j==1||j==i+(i-1))
                {
                    System.out.print(1+" ");
                }
                else
                {
                    System.out.print(0+" ");
                }

            }
            System.out.println();

        }
    }
}
