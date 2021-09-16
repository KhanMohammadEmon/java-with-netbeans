public class CurrentAccount extends Account{

    {
        System.out.println("Current Account");
    }

    public String name;

    public CurrentAccount(String name) {
        this.name = name;
    }

    @Override
    public void deposit_money(double new_blanc) {
        super.deposit_money(new_blanc);
    }

    @Override
    public void withdraw_money(double money) {
        System.out.println("Withdraw Money : "+money);
        /// add 5% vat
        double interest = ((money *5)/100);
        this.blanc = (blanc - (money+interest));
    }

    @Override
    public void check_money() {
        System.out.println("Name :"+name);
        System.out.println("Total money is : "+blanc);
    }
}
