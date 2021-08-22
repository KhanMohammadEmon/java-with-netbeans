package New;

public class Device {
    public String name;
    public String model;
    public int price;

    public Device(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public Device() {

    }

    public void printDetails()
    {
        System.out.println("Name: "+name+"\nModel : "+model+"\nPrice: "+price);
    }
    public void show()
    {

    }
}
