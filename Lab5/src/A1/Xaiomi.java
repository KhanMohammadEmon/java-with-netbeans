

public class Xaiomi extends Mobile {
    public String color = "Black";


    @Override
    public void printDetails() {
        System.out.println("Name: "+name+" Price : "+price +" Model : "+model +" Color : "+color );
    }

    @Override
    public void wifiSupport() {
        System.out.println("Wifi Support : Yes");
    }
}
