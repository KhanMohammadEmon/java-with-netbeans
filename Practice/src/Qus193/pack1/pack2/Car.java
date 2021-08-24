package Qus193.pack1.pack2;
import Qus193.pack1.Vehicle;

public class Car extends Vehicle {
    public Car(String name, int id){
        super(name);
        this.id=id;
    }
    void print(){
        System.out.println(name + " " + id);
    }
}
