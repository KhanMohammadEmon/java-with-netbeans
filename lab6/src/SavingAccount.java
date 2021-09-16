public class SavingAccount extends Account{

    {
        System.out.println("Saving Account");
    }
    public String name;

    public SavingAccount(String name) {
        this.name = name;
    }

    @Override
    public void deposit_money(double new_blanc) {
        System.out.println("Deposit Money: "+new_blanc);
        this.blanc = blanc + new_blanc;

    }

    @Override
    public void withdraw_money(double money) {
        this.blanc = blanc - money;
    }

    @Override
    public void check_money() {
        System.out.println("Name :"+name);
        /// 5% interest
        double interest = ((blanc *5)/100);
        System.out.println("Total money is : "+(blanc+interest));
    }


}
