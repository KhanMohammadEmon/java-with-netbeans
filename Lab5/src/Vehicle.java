public abstract class Vehicle {
    public int wheels;
    public String name;
    public float speed;
    void speedup(int speed){
        this.speed = this.speed+speed;
    }
    public void printDetails(){
        System.out.println(this.name+" Car has "+wheels+" wheels. It hascan run at speed of "+speed+" mph");
    }
    //abstract method fo Vehicle
    //public abstract void runsOn();
}
