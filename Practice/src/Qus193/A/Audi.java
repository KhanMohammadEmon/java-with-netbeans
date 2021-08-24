package Qus193.A;
public class Audi extends Car{


    public Audi(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void accelerate() {
        System.out.println("speed up");
    }

    @Override
    public void brake() {
        System.out.println("Stop");
    }

   /* public static void main(String[] args) {
        Car a1 = new Audi("A3","Blue",120);
        a1.print();
        a1.brake();
        a1.accelerate();
    }*/
}
