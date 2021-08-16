package AssignmentKibria.Q6;

public class Employee {
    String name;
    float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    void printSalary()
    {

    }

    public static void main(String[] args) {
        SilverEmployee SE = new SilverEmployee("Kibria",10000);
        PlatinumEmployee PE = new PlatinumEmployee("Emon",15000);
        SE.printSalary();
        PE.printSalary();
    }

}
