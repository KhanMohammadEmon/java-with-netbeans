public class Driver1 {
    public static void main(String[] args) {
     Shape s1 = new Rectangle();
     s1.setDim1(4);
     s1.setDim2(8);
     s1.printArea();

        Shape s2 = new Circle();
        s2.setDim2(5);
        s2.printArea();
    }
}
