package A1;

public class Driver {
    public static void main(String[] args) {
        Mobile m1 = new Samsung();
        m1.price = 100;
        m1.name="Samsung";
        m1.model = "A30s";
        m1.printDetails();
        m1.wifiSupport();

        Sony t1 = new Sony();
       t1.name();
       t1.type();
       t1.Color();

    }
}
