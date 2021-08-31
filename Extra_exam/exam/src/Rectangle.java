public class Rectangle extends Shape{

    int rArea = getDim1()*getDim2();
    @Override
    public void printArea() {
        System.out.println("Rectange Area is : "+rArea);
    }
}
