public class Driver2 {
    public static void main(String[] args) {
        Bank A = new BankA();
        System.out.println("Bank A Deposited is : "+A.getBalance()+"$");
        Bank B = new BankB();
        System.out.println("Bank B Deposited is : "+B.getBalance()+"$");
        Bank C = new BankC();
        System.out.println("Bank C Deposited is : "+C.getBalance()+"$");

    }
}
