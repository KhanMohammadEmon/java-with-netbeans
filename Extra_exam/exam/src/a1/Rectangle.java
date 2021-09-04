package a1;

public class Rectangle extends Shape {

    int rArea =dim1*dim2;

    public Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    public void printArea() {
        System.out.println("Rectange Area is : "+rArea);
    }
}
