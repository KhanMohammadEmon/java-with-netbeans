public class Driver1 {
    public static void main(String[] args) {
     Shape s1 = new Rectangle(12,2);
     s1.dim1=4;
     s1.dim2=8;
     s1.printArea();

        Shape s2 = new Circle(11,3);
        s2.dim2=5;
        s2.printArea();
    }
}
