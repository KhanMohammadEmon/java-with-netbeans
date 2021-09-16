public class Circle extends Shape{

        double cArea  = 3.14*(dim1);

        public Circle(int r) {
            super(r,r);

        }

        @Override
        public void printArea() {
            System.out.println("Circle Area is : "+cArea);
        }
    }

