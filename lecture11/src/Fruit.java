public class Fruit {
    public String name ;
    public float weight;
    public float price_per_kg;

    public Fruit() {
    }

    public Fruit(String name, float weight, float price_per_kg) {
        this.name = name;
        this.weight = weight;
        this.price_per_kg = price_per_kg;
    }
    public void reducePricePerKG(int n)
    {
        price_per_kg = price_per_kg-n;
    }

    public void increasePricePerKG(int n)
    {
        price_per_kg = price_per_kg+n;
    }
    public void printDetails()
    {
        System.out.println("Fruit Details:");
        System.out.println("Name: "+name);
        System.out.println("Weigth : "+weight+" KG");
        System.out.println("Price per kg : "+price_per_kg);
        System.out.println("Total Price : "+price_per_kg*weight);
    }
}
