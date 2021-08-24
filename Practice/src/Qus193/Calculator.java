package Qus193;
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(int a, double b) {
        return a + b;
    }

    public double add(int a, double b, double c) {
        return a + b + c;
    }

}

class Main
{
    public static void main(String[] args) {
            Calculator Add = new Calculator();
            double sum = Add.add(12,20.0,32.0);
            System.out.println(sum);
    }
}
