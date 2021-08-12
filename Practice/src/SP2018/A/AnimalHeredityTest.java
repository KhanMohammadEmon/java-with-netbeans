package SP2018.A;

public class AnimalHeredityTest {
    public static void main(String[] args) {
        Animal a = new Animal("Ethon","011",23);
        System.out.println(a.getName());
        System.out.println(a.getId());
        System.out.println(a.getCp());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        a.setName("EK");
        a.setId("022");
        a.setCp(34);

        System.out.println(">>>>>>>>After Result SetOut>>>>>>>");

        System.out.println(a.getName());
        System.out.println(a.getId());
        System.out.println(a.getCp());


    }
}
