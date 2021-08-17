public class Driver {
    public static void main(String[] args) {
    
     Car c1 = new Car();
     c1.name = "Toyoya";
     c1.speed = 150;
     c1.wheels = 4;
     c1.speedup(50);
     c1.color = "blue";
     c1.printDetails();
     c1.runsOn();


     Vehicle v2 = new Car() ;
     v2.speed =50;
     v2.name="Null";
     v2.printDetails();


     Tiger t1 = new Tiger();
     t1.animalsound();
     t1.run();


     Horse h1 = new Horse();
     h1.animalsound();
     h1.run();
     h1.sleeping();
    }
}
