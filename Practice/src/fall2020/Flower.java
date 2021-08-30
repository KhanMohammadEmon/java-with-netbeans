package fall2020;

public class Flower {
    private int nPetals;
    private String color;

    public Flower(int nPetals,String color)
    {
        this.color = color;
        this.nPetals = nPetals;
    }
    public void printName()
    {
        System.out.println("Flower");
    }
}
class rose extends Flower{
private String flowerName;
    public rose(int nPetals, String color) {
        super(nPetals, color);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    void printFlower(Flower a)
    {
        a.printName();
    }

    public static void main(String[] args) {
        rose r1 = new rose(4,"red");
        System.out.println(r1.flowerName);

    }
}

