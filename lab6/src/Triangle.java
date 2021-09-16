public class Triangle extends Shape{

    public Triangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    public void printArea() {
        double tArea =(.5)*dim1*dim2;
        System.out.println("Triangle Area is : "+tArea);
    }
}
