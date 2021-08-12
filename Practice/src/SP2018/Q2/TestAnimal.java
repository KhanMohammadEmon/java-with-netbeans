package SP2018.Q2;

public class TestAnimal {
        public static void main(String[] args){
            Animal a = new Animal("Rat");
            Dinosaur d = new TRex();
            a.display();
            d.display();
            a=d;
            a.display();
            d =(Dinosaur)a;
            d.display();
        }
}
