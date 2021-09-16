public class Rectangle extends Shape{
    double rArea =dim1*dim2;

    public Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    public void printArea() {
        System.out.println("Rectangle Area is : "+rArea);
    }
}
