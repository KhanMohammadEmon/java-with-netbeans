public class JavaLecture15 {
    public  void add(int x ,String y)
    {
        int y_int = 0;
        try {
             y_int = Integer.parseInt(y);
        }
        catch (NumberFormatException e){
            System.out.println("Can't convert String to int."+e);
        }

     x = x+y_int;
        System.out.println("Sum : "+x);
    }

    public static void main(String[] args) {
     JavaLecture15 j1 = new JavaLecture15();
     //j1.add(10 ,"30");
     j1.add(10 ,"Ten");
    }
}
