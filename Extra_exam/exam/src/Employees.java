public class Employees {
    public String name;
    public int age;
    private double salary=0;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public  void tax()
    {
        double s_tax = (getSalary()*5)/100;
        System.out.println("His/her total tax is : "+s_tax);
    }
}
