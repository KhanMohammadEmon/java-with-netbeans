public class InheritanceTest extends Inheritance{
    public int z = 30;

    public InheritanceTest(int w) {
        super(w);
    }

    public InheritanceTest() {
        super();
    }

    public static void main(String[] args) {
        Inheritance i = new InheritanceTest();
        i.show();
        InheritanceTest in = new InheritanceTest();
        System.out.println(i.x+" "+i.y+" "+ in.z);
        System.out.println(in.w);
    }
}
