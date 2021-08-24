package Qus193.pack1;
public class Bike extends Vehicle {
    public Bike(String name, int id){
        super(name);
        this.id=id;
    }
   public void print(){   // now I add here public class.
        System.out.println(name+ " " + id);
    }
}
