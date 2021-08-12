package SP2018.Q2;

public class TRex extends Dinosaur {
    TRex(){
        super("TRex");
    }
    public void display(){
        super.display();
        System.out.println("but "+name+" is carnivorous");
    }
}
