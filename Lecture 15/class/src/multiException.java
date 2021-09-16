public class multiException {
    public  void add(int x ,String y)
    {
        int y_int = 0;
        try {
            y_int = Integer.parseInt(y);
           if(y_int > 10)
            y_int = y_int / 0;
        }
        catch (NumberFormatException e1){
            System.out.println("Can't convert String to int." + e1);
        }
        catch (ArithmeticException e2){
            System.out.println("2nd Exception" + e2);
        }
       catch (Exception e3)
       {
           System.out.println("3rd Exception : " +e3);
       }

        x = x+y_int;
        System.out.println("Sum : "+x);
    }

    public static void main(String[] args) {
        JavaLecture15 j1 = new JavaLecture15();
        //j1.add(10 ,"30");
        j1.add(10 ,"20");
    }
}
