public class Salaried extends Employee{
    @Override
    public void printdetails() {
        System.out.println("Name :" +name);
        System.out.println("ID :" +id);
        System.out.println("Age :" +age);
        System.out.println("Salary :" +salary);
    }

    public void update()
    {
        name = "Badhon";
        id = "012";
        age = 29;
        salary = 10000;

    }

}
