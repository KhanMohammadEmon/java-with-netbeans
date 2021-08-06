//Overriding Methods
class A {
public void show()
{
    System.out.println("Birds Can Flay");
}
}

class B extends A{
 public void show()
 {
     System.out.println("Birds Fly in the sky");
 }

    public static void main(String[] args) {
        B b = new B();
        A a1 = new A();
        A a = new B();
        b.show();
        a.show();
        a1.show();
    }
}