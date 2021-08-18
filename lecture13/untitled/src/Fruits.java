interface  Fruit_Market{
    public void marketName();
    public void marketTime();
}
 interface Fruit_Country{
    public void country_name();
 }
public abstract class Fruits {
    String name;

    public Fruits(String name) {
        this.name = name;
    }
    {
        System.out.println("This is Fruit class");
    }
    void showName()
    {
        System.out.println("Name : "+name);
    }
    public abstract void colour(String colour);

}

class Apple extends Fruits implements Fruit_Market,Fruit_Country {

    Apple(String name) {
        super(name);
    }

    @Override
    public void colour(String colour) {
        System.out.println("Apple colour is : "+colour);
    }

    @Override
    public void marketName() {
        System.out.println("UniMart");
    }

    @Override
    public void marketTime() {
        System.out.println("9Am to 9Pm");
    }
    public  void countryname()
    {
        System.out.println("Bangladesh");
    }

    public static void main(String[] args) {
        Apple a = new Apple("Apple");
        a.colour("Red");
        a.showName();
        a.marketName();
        a.marketTime();
        a.country_name();
    }

    @Override
    public void country_name() {
        System.out.println("Bangladesh");
    }
}