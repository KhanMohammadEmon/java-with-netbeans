public class Driver2 {
    public static void main(String[] args) {

        /// for no 4(2)
        Account a1 = new StudentAccount("Emon");
        a1.deposit_money(100);
        a1.withdraw_money(50);
        a1.check_money();

       Account a2 = new CurrentAccount("Emon Khan");
        a2.deposit_money(1000);
        a2.withdraw_money(100);
        a2.check_money();

        Account a3 = new SavingAccount("Khan Mohammad Emon");
        a3.deposit_money(2000);
        a3.deposit_money(200);
        a3.withdraw_money(500);
        a3.check_money();


    }
}
