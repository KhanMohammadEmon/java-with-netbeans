package New;

public class Mobile extends Device{
    public String color;

    @Override
    public void printDetails()
    {
        System.out.println("Name: "+name+"\nModel : "+model+"\nPrice: "+price+"\nColor : "+color);
    }

    @Override
    public void show() {
        System.out.println("Another name : "+name);
    }
}
