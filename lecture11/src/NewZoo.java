public class NewZoo {
        public static void main(String[] args) {
            Animal1 a = new Animal1();
            bird1 b = new Magpi1();
            Magpi1 c = (Magpi1)b;

            a.fly();
            b.fly();
            ((Magpi1)b).fly(15);
            c.fly();



            a.eat();
            b.eat();
            c.eat();
        }
}
 class Animal1 {
    public Animal1() {
        System.out.println("An animal is created");

    }
    void fly()
    {
        System.out.println("Don't know if i can fly!");
    }
    void eat()
    {
        System.out.println("Eating.....");
    }
}
class bird1 extends Animal1{
    public bird1() {
        System.out.println("A bird is created .");
    }
    void fly()
    {
        System.out.println("Flying....");
    }
}
class Magpi1 extends bird1{
    Magpi1()
    {
        System.out.println("A Magpie is Created .");
    }
    void fly()
    {
        System.out.println("Magpie is flying...");
    }
    void fly(int speed)
    {
        System.out.println("Magpie is flaying at speed: " +speed);
    }
    void eat()
    {
        System.out.println("Magpie is eating");
    }
}
