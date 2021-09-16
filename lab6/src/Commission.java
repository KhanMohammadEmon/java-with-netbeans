public class Commission extends Employee{
    public void update()
    {
        name = "Emon";
        id = "014";
        age = 24;
        salary = 30000;

    }

    @Override
    public void printdetails() {
        System.out.println("Name :" +name);
        System.out.println("ID :" +id);
        System.out.println("Age :" +age);
        System.out.println("Salary :" +salary);
    }
}
