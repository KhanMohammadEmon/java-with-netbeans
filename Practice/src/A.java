public class A {
    public A() {
        System.out.println("Inside A");
    }
    public A(String msg)
    {
        System.out.println("A: "+msg);
    }
}
class B extends A{
    public B() {
        System.out.println("Inside B");
    }
    public B(String msg)
    {
        System.out.println("B: "+msg);
    }

}
class C extends B{
    public C() {
        System.out.println("Inside C");
    }
    public C(String msg)
    {
        System.out.println("C: "+msg);
    }

    public static void main(String[] args) {
        C c1 = new C();
        C c2 = new C("University");
    }
}