package Qus193.A;
public abstract class Car {
  protected String model;
  protected String color;
  protected int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public abstract void  accelerate();
  public abstract void brake();
/*public void print()
{
    System.out.println("Model : "+model+"\nColor: "+color+"\nSpeed : "+maxSpeed);
}*/


}
