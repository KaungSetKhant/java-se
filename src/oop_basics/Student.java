package oop_basics;

public class Student {
    String name;
    int id;
    int mark;
    char grade;
    static String schoolName;
    String schoolName2;

    void insert (String n, int i, char g)
    {
       name = n;
       id = i;
       grade = g;
    }
   void insert(String nn)
   {
      name = nn;
   }
    public static void main(String[] args)
    {
        Student student = new Student();
        student.name = "Kaung Set Khant";
        System.out.println(student.name);
        student.id = 001;
        System.out.println(student.id );
        student.grade = 'A';
        System.out.println(student.grade);
        student.schoolName = "KMD";
        System.out.println(schoolName + "\n");

        Student student1 = new Student();
        student1.name = "Kaung Khant";
        System.out.println( student1.name );
        student1.id = 002;
        System.out.println(student1.id);
        student1.grade = 'A';
        System.out.println(student1.grade);
        student1.schoolName = "KMD";
        System.out.println(student1.schoolName + "\n");

        Student student2 = new Student();
        student2.name = "Set Khant";
        System.out.println(student2.name);
        student2.id = 003;
        System.out.println(student2.id);
        student2.grade = 'B';
        System.out.println(student2.grade);
        student2.schoolName2 = "Metro";
        System.out.println(student2.schoolName2 + "\n");

        Student student3 = new Student();
        student3.name = "Khant";
        System.out.println( student3.name );
        student3.id = 004;
        System.out.println(student3.id);
        student3.grade = 'A';
        System.out.println( student3.grade);
        student3.schoolName2 = "GUSTO";
        System.out.println(student3.schoolName2 + "\n");

        Student student4 = new Student();
        student4.insert("KSK", 005, 'B');
        System.out.println(student4.name);
        System.out.println(student4.id);
        System.out.println(student4.grade);

    }


}
