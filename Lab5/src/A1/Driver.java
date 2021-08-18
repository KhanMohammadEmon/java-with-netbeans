
public class Driver {
    public static void main(String[] args) {
        Mobile m1 = new Xaiomi();
        m1.price = 100;
        m1.name="poco";
        m1.model = "X3";
        m1.printDetails();
        m1.wifiSupport();

        Walton t1 = new Walton();
       t1.name();
       t1.type();
       t1.Color();
       t1.price();

    }
}
