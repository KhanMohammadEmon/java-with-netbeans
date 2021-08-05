
package javalecture3;
import javalecture3.SuperMan;
public class SpiderMan {
    
    public String name,power;
    
    public SpiderMan(String name , String power)
    {
        this.name = name;
        this.power = power;
    }
    
    public void display()
    {
        System.out.println("Name : "+name+"; Power : "+power);
    }

    public static void main(String[] args) {
        
     SpiderMan s = new SpiderMan("Peter Parker","Superhuman strength, agility");   
        s.display();
        SuperMan superMan = new SuperMan("SuperMan","Power");
        superMan.display();
    }
    
}
