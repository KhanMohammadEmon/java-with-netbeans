package A1;

public class Samsung extends Mobile {
    public String color = "Blue";


    @Override
    public void printDetails() {
        System.out.println("Name: "+name+" Price : "+price +" Model : "+model +" Color : "+color );
    }

    @Override
    public void wifiSupport() {
        System.out.println("Wifi Support : Yes");
    }
}
