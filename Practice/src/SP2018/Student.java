package SP2018;

public class Student {
    private String name, id;
    private double cgpa;
    public static String temp_name;
    public static String temp_id;
    public static double temp_cgpa;



    public static void main(String[] args){
        Student s1 = new Student("011162101", "Kratos", 3.0);
        Student s2 = new Student("011162102", "Thanos", 4.0);

        System.out.println("Before swap");
        System.out.println(s1);
        System.out.println(s2);

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

    public String getName(){return name;}
    //public void setName(String name) {this.name = name;}

    public String getId() {return id;}
   // public void setId(String id) {this.id = id;}

    public double getCgpa() {return cgpa;}
   // public void setCgpa(double cgpa) {this.cgpa = cgpa;}

    public static String getTemp_name() {return temp_name;}

   // public static void setTemp_name(String temp_name) {Student.temp_name = temp_name;}

    public static String getTemp_id() {return temp_id;}

    //public static void setTemp_id(String temp_id) {Student.temp_id = temp_id;}

    public static double getTemp_cgpa() {return temp_cgpa;}

   // public static void setTemp_cgpa(double temp_cgpa) {Student.temp_cgpa = temp_cgpa;}

    @Override
    public String toString() {
        return id + " "+ name +" " +cgpa ;
    }

     public static void swap(Student s1, Student s2) {
     temp_name = s1.name;
     temp_id = s1.id;
     temp_cgpa = s1.cgpa;

     s1.id = s2.id;
     s1.name= s2.name;
     s1.cgpa= s2.cgpa;

     s2.id = temp_id;
     s2.name=temp_name;
     s2.cgpa =temp_cgpa;
    }

}
