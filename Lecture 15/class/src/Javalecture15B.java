
// call stark mechanism
public class Javalecture15B {
    public int a (String str)
    { int x = 0;
        try {
             x = Integer.parseInt(str);
        }
       catch (NumberFormatException e)
       {
           System.out.println(e);
       }
        return x;
    }
    public void b()
   {
    System.out.println(a("five"));
   }
    public static void main(String[] args)
    {
      Javalecture15B j2 = new Javalecture15B();
     try {
         j2.b();
     }
      catch (Exception e)
      {
          System.out.println("Exception is: "+e);
      }
    }
}
