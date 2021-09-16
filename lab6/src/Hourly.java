public class Hourly extends Employee {

    public void update()
    {
        name = "karim";
        id = "011";
        age = 28;
        salary = 1000;

    }
    @Override
    public void printdetails()
    {
            System.out.println("Name :" +name);
            System.out.println("ID :" +id);
            System.out.println("Age :" +age);
            System.out.println("Salary :" +salary);

    }
}
