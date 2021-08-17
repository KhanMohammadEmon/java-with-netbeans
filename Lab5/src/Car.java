public class Car extends Vehicle{
public String color;


    @Override
    public void printDetails(){
        System.out.println(this.name+" Car has "+wheels+" wheels. It hascan run at speed of "+speed+" mph"+". It's color is "+color);
    }

    @Override
    public void runsOn() {
        System.out.println(" Runs in the Ground");
    }
}
