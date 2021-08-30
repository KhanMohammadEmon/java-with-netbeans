public class U_2_5_2 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i <= 5; i++) {
            for (int j = i; j >=0 ; j--) {
                if(j==0)
                {
                    System.out.print(5+" ");
                }
                else
                {
                    System.out.print(n-j+" ");
                }
            }
            System.out.println();
        }   
    }
}
