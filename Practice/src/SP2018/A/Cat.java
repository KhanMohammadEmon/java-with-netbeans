package SP2018.A;

public class Cat extends Animal{
    private String color = "White";
    Animal a = new Animal();

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat : " +a.toString()+
                " color=" + color ;
    }
}
