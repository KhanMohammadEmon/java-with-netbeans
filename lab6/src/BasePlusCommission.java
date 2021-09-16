public class BasePlusCommission extends Employee{
    public void update()
    {
        name = "Imran";
        id = "021";
        age = 26;
        salary = 12000;

    }

    @Override
    public void printdetails() {
        System.out.println("Name :" +name);
        System.out.println("ID :" +id);
        System.out.println("Age :" +age);
        System.out.println("Salary :" +salary);
    }
}
