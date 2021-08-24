package fall2020;

public class School {
    Student[] students;
   School()
   {
       students = new Student[3];
   }
   void addStudent(int id,String name ,float cgpa)
   {
       students[id] = new Student(name,cgpa);
   }
   void updateStudent(int id , float new_cgpa)
   {
       for (int i = 0; i < students.length; i++) {  // add
           if(id == i)
           {
               this.students[i].cgpa = new_cgpa;
           }

       }
   }
   void printStudentDetail(int id)
   {
       for (int i = 0; i < students.length; i++) {  //add
           if(id == i)
           {
               System.out.println(students[i].name+" "+students[i].cgpa);
           }

       }
   }
}


class Student   //add
{
    public String name;
    public float cgpa;

    public Student (String name, float cgpa) {
     this.name = name;
     this.cgpa  = cgpa;
    }

}

class SchoolDemo{
    public static void main(String[] args) {
        School school = new School();
        school.addStudent(0,"Alice",3.5f);
        school.addStudent(1,"Bob",3.7f);
        school.printStudentDetail(0);
        school.updateStudent(0,3.7f);
        school.printStudentDetail(0);
    }
}