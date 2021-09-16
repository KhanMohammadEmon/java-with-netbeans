public abstract class Shape {
    public int dim1,dim2;
    public abstract void printArea();

    public Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
}
