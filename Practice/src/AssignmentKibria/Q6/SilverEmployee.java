package AssignmentKibria.Q6;

public class SilverEmployee extends Employee {

    public SilverEmployee(String name, float salary) {
        super(name, salary);
    }

    @Override
    void printSalary()
    {
        System.out.println("Employee Name: "+name +"\nBonus :"+salary*(7.0f/100));
        float total_S= salary+(salary*(7.0f/100));
        System.out.println("Total Salary : "+total_S);
    }
}
