package SP2018;

public class Student {
    private String name, id;
    private double cgpa;


    public static String temp_name;
    public static String temp_id;
    public static double temp_cgpa;



    public static void main(String[] args){
        Student s1 = new Student("011162101", "Kratos", 3.0);//obj1
        Student s2 = new Student("011162102", "Thanos", 4.0);//obj2

        System.out.println("Before swap");//
        System.out.println(s1);//obj1 print
        System.out.println(s2);//obj2 print

        swap(s1, s2);
        System.out.println("After swap");
        System.out.println(s1);
        System.out.println(s2);

    }

    public Student(String id, String name, double cgpa) {
        this.id = id;
        this.name = name ;
        this.cgpa= cgpa;
    }

    public Student()
    {

    }
    public String getName(){return name;}
    public String getId() {return id;}
    public double getCgpa() {return cgpa;}
    public static String getTemp_name() {return temp_name;}
    public static String getTemp_id() {return temp_id;}
    public static double getTemp_cgpa() {return temp_cgpa;}

    @Override
    public String toString() {
        return id + " "+ name +" " +cgpa ;
    }

     public static void swap(Student s1, Student s2) {

        temp_name = s1.name;
         s1.name= s2.name;
         s2.name=temp_name;


         temp_id = s1.id;
         s1.id = s2.id;
         s2.id = temp_id;

         temp_cgpa = s1.cgpa;
         s1.cgpa= s2.cgpa;
        s2.cgpa =temp_cgpa;
    }

}
