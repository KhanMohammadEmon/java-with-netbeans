public class Inheritance {
    public int x = 10;
    public int y = 20;
    public int w = 40;
    public int e =50;
    public int m = 100;

    public Inheritance() {

    }
    public Inheritance(int w) {
        this.w = w;
    }

    public Inheritance(int e, int m) {
        this.e = e;
        this.m = m;
    }

    public void show()
    {
        System.out.println(x+" "+y);
    }


}
