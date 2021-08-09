public class Zoo {
    public static void main(String[] args) {
    Animal a = new Animal();
    bird b = new Magpi();
    Magpi c = (Magpi)b;

    a.fly();
    b.fly();
        ((Magpi)b).fly(15);
    c.fly();



        a.eat();
        b.eat();
        c.eat();
    }
}
