package javalecture6;
public class JavaLecture6 {
    public static void main(String[] args) {
        SuperHero obj = new SuperHero();
        obj.setVar(100);
        System.out.println(obj.getVar());
    }
}
class SuperHero {
   private int var ;  //Encapsulation
   public void setVar(int var) //setter method
   {
       this.var=var;
   }
   public int getVar()  //getter method
   {
       return var;
   }
}

class SuperMan extends SuperHero{   //Sub-Class or child Class of superhero
    
    
}