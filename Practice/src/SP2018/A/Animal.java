package SP2018.A;

public class Animal {
   private String vegetarian = "Yes";
   private String eats = "Milk";
   private int noOfLegs = 4;

    public String getVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    @Override
    public String toString() {
        return "vegetarian= " + vegetarian +
                " eats= " + eats +
                " noOfLegs= " + noOfLegs
                ;
    }
}
