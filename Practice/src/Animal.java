public class Animal {
    public Animal() {
        System.out.println("Animal Created");
    }
    void eat()
    {
        System.out.println("Animal eats");
    }
    void fly()
    {
        System.out.println("Animal fly");
    }
}

class Bird extends Animal{
    public Bird() {
        System.out.println("Birds Created");
    }
    void fly()
    {
        System.out.println("Birds fly");
    }

    public static void main(String[] args) {
        Animal a = new Bird();
        a.fly();
        a.eat();
    }
}
