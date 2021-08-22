package New;

public class Driver {
    public static void main(String[] args) {
        /*Mobile m1 = new Mobile();
        m1.name = "Samsung";
        m1.model= "A30s";
        m1.price=19000;
        m1.color = "Blue";
        m1.printDetails();
        m1.name = "Xaimoi";
        m1.show();*/
        TV t1 = new TV();
        t1.setName("Sony");
        //System.out.println(t1.getName());
        t1.setModel("a1");
        //System.out.println(t1.getModel());
        t1.setPrice(10000);
       // System.out.println(t1.getPrice());
        System.out.println(t1.toString());



    }

}
