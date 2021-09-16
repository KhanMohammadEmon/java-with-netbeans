public class StudentAccount extends Account{
    {
        System.out.println("Student Account");
    }
    public String name;

    public StudentAccount(String name) {
        this.name = name;
    }

    @Override
    public void check_money() {
        System.out.println("Name :"+name);
        System.out.println("Total money is : "+blanc);

    }
}
