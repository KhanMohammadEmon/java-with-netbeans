public class Account {
    public  double blanc;
    public  void deposit_money(double new_blanc)
    {
        System.out.println("Deposit Money: "+new_blanc);
        this.blanc = blanc + new_blanc;
    }
    public  void withdraw_money(double money)
    {
        System.out.println("Withdraw Money : "+money);
        this.blanc = blanc - money;
    }
    public  void check_money()
    {
        System.out.println("Total money is : "+blanc);
    }
}
