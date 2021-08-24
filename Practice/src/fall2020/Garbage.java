package fall2020;

public class Garbage {
   private int val;
    Garbage(int a)
    {
        val = a;

    }
    void update (Garbage a)
    {
        this.val = a.val;
    }


}
class  GC
{
    public static void main(String[] args) {
        Garbage g1 = new Garbage(1);
        new Garbage(3);
        g1.update(new Garbage(3));
        System.out.println(g1);
    }
}