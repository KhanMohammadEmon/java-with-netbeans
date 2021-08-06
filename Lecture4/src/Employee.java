/*Invoking Overriding Methods*/

class Employee {
    public String name = "Emon khan";
    public float salary = 50000;
    public void showDetails()
    {
        System.out.println(name +" "+salary);
    }

}

class Manager extends Employee
{
    public String department = "Enginnering";
    public void showDetails()
    {
        super.showDetails();
        System.out.println(" "+department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.showDetails();
    }
}
