
public abstract class Mobile {
public String name;
public int price;
public String model;
public abstract void wifiSupport();
public void printDetails ()
{
    System.out.println("Name: "+name+" Price : "+price +" Model : "+model );
}

}
