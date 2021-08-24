public class TestSuper {
        public static void main(String[] args) {
            Child c = new Child("Parent","Child");
            c.show();
            c.display();

        }

    }
    class Parent{
        String name;

        void message(){
            System.out.println("Welcome To Parent Class");
        }



    }
    class Child extends Parent{
        String name;
        Child(String a,String b){
            super.name=a;
            name=b;
        }

        void show() {
            System.out.println("superclass’s name: " + super.name + "; subclass’s name: " + name);
        }


        void message(){

            System.out.println("Welcome To Child Class");
        }




        void display(){
            message();
            super.message();

        }


    }
