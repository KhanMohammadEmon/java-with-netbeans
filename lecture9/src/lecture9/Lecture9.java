
package lecture9;

 class SuperHero extends Object{
    public String name;
    
    public SuperHero(String name)
    {
        this.name = name;
    }

    public void show()
    {
        System.out.println(name);
    }
}

class IronMan extends SuperHero
{
    public IronMan(String name)
    {
       super(name); 
       System.out.println();
    }
    public void show()
    {
        System.out.print("IronMan : ");
        super.show();
    }
     
}

class WonderWoman extends SuperHero
{
    public WonderWoman(String name)
    {
        super(name);
        System.out.println();
    }
    public void show()
    {
        System.out.print("WonderWoman : ");
        super.show();
    }
    
}

public class Lecture9{
    public void homogeneousCollection()
    {
        SuperHero[] arr1 = new SuperHero[2];
        arr1[0]= new SuperHero("Captain America");
        arr1[1]= new SuperHero("Thor");
        arr1[0].show();
        arr1[1].show();
        
        SuperHero[] arr2 = new IronMan[2];
        arr2[0]= new IronMan("Tony");
        arr2[1]= new IronMan("Tony Stark");
        arr2[0].show();
        arr2[1].show();
        
    }
    public void heterogeneousCollection()
    {
        SuperHero[] arr = new SuperHero[3];
        arr[0] = new SuperHero("Name of Super Heroes ");
        arr[1]= new IronMan("Tony Stark");
        arr[2]= new WonderWoman("Gay gandela");
        arr[0].show();
        arr[1].show();
        arr[2].show();
    }
    public static void main(String[] args)
    {
      Lecture9 obj = new Lecture9();
      obj.homogeneousCollection();
      obj.heterogeneousCollection();
    }
}