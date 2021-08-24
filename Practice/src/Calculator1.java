
public class Calculator1 {

        public int add(int a ,int b)
        {
            return a+b;
        }

        public double add(int a,double b)
        {
            return a+b;
        }

        public double add(int a,double b,double c)
        {
            return a+b+c;
        }

        public static void main(String[] args) {
            int a;
            int b;
            a=19;
            b=20;
            Calculator1 c1 = new Calculator1();

            System.out.println("Sum : "+c1.add(a,b));

        }
    }

