public class JavaLecture10 {
    public void test (Object c)
    {
       if (c instanceof SuperHero)
        ((SuperHero) c).power();
       else if (c instanceof SuperMan)
           ((SuperMan) c).power();
       else
           System.out.println("Object "+c +" isn't not from SUper Hero And Super Man Classes");
    }
    public static void main(String[] args) {
        SuperHero a = new SuperHero();
        SuperMan b = new SuperMan();
        JavaLecture10 x = new JavaLecture10();
        x.test(a);
    }
}
