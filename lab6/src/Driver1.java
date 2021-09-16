public class Driver1 {
    public static void main(String[] args) {
       //lab no 4(1)
            Employee em = new Employee();
            em.name = "Asif";
            em.id = "100";
            em.age=23;
            em.salary=1000f;
            em.printdetails();
            Hourly h1 = new Hourly();
            h1.printdetails();
            Salaried s1 = new Salaried();
            s1.printdetails();
            BasePlusCommission b1 = new BasePlusCommission();
            b1.printdetails();
            Commission c1 =new Commission();
            c1.printdetails();


    }
}
