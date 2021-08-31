public class Circle extends Shape{

     double cArea  = 3.14*(dim1);

    public Circle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    public void printArea() {
        System.out.println("Rectange Area is : "+cArea);
    }
}
