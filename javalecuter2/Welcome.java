package romantic;

public class Welcome {
	public static void main (String[] args)
	{
		System.out.println("Hi Romio");
		Julia j  = new Julia();
		j.information();
		
	}
}

class Julia{

    public String name ;
    public Julia ()
    {
       name = "Ms. Julia";
    }

	public void information(){
          System.out.println("Hi Ami " +name);
          System.out.println("Next");
	}
	
	public Julia(String name)
	{
		this.name = name ;
		//System.out.println("Hi Ami2 " +name);
	}

}