package a1;

public class Vector2D{
    double x, y;
    public Vector2D(){
        x=0;
        y=0;
    }
   public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }
   public double Multiplied(double u,double v)
   {
       double multi = (u*x)*(v*x)+(u*y)*(v*y);
      return multi;
   }
   public double Multiplied(double u)
   {
       double multi = (u*x)+(u*y);
      return multi;
   }

    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(1,2);


        System.out.println( v1.Multiplied(2));
        System.out.println(v1.Multiplied(2,3));
    }

}