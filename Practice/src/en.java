public class en {
    private int number=10;
    private String name = "Bangladesh";

    public int getNumber() {
        return number;
    }

    public  String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return "Name: "+name +" Roll : "+number;
    }
}
class entest{
    public static void main(String[] args) {
        en e = new en();
        System.out.println(e);
    }
}