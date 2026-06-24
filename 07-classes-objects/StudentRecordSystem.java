/*Question 3: Student Record System
Create a Java program that manages student records using objects.

The program should:
- Create a class named `Student`.
- Store information such as student name, age, and other relevant details.
- Create five student objects.
- Assign values to each student's attributes.
- Display the records of all students in a structured format.
*/

class Student{
    String name;
    int age;
    String department;
}

public class StudentRecordSystem {
    public static void main(String[] args) {
        
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();
        Student student4=new Student();
        Student student5=new Student();

        student1.name="Amal";
        student1.age=23;
        student1.department="CIS";

        student2.name="Nirmal";
        student2.age=20;
        student2.department="SE";

        student3.name="Saduni";
        student3.age=21;
        student3.department="CIS";

        student4.name="Chathura";
        student4.age=25;
        student4.department="DS";

        student5.name="Mohommed";
        student5.age=24;
        student5.department="DS";

        System.out.println("Name: "+student1.name);
        System.out.println("Age: "+student1.age);
        System.out.println("Department: "+student1.department);
        System.out.println("--------------------------------");
        System.out.println("Name: "+student2.name);
        System.out.println("Age: "+student2.age);
        System.out.println("Department: "+student2.department);
        System.out.println("--------------------------------");
        System.out.println("Name: "+student3.name);
        System.out.println("Age: "+student3.age);
        System.out.println("Department: "+student3.department);
        System.out.println("--------------------------------");
        System.out.println("Name: "+student4.name);
        System.out.println("Age: "+student4.age);
        System.out.println("Department: "+student4.department);
        System.out.println("--------------------------------");
        System.out.println("Name: "+student5.name);
        System.out.println("Age: "+student5.age);
        System.out.println("Department: "+student5.department);

    }
}
