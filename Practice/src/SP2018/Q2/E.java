package SP2018.Q2;

public class E {
    int a;
    public int getA() { return a; }
    public void setA(int a) { a = a; }
    E show() { return this; }
    public static void main(String[] args) {
        E obj = new E();
        obj.setA(10);
        System.out.println(obj.getA());
        E obj2 = obj.show();
        System.out.println(obj2.getA());
    }
}
