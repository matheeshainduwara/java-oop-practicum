/*
Question 3: Student Object Management

Create a Java program that manages student records using an `ArrayList<Student>`.

Create a class named `Student` containing:
- Student ID
- Student Name
- Age
- GPA

The program should:
- Create multiple student objects.
- Store the student objects in an `ArrayList<Student>`.
- Display all student records.
- Search for a student using the student ID.
- Remove a student using the student ID.
- Display the updated student list after deletion.
- Display the total number of students using the `size()` method.
- Check whether the student list is empty using the `isEmpty()` method.
- Determine whether a specific student object exists in the list using the `contains()` method.
 */

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String id;
    String name;
    int age;
    double gpa;
}
class StudentObjectManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        Student student1 = new Student();
        student1.id = "STD001";
        student1.name = "Shiwon";
        student1.age = 21;
        student1.gpa = 3.85;

        Student student2 = new Student();
        student2.id = "STD002";
        student2.name = "Pasindu";
        student2.age = 22;
        student2.gpa = 3.25;

        Student student3 = new Student();
        student3.id = "STD003";
        student3.name = "Samaya";
        student3.age = 23;
        student3.gpa = 3.95;

        //add student details to arraylist
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for(Student s : students){

        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("GPA: " + s.gpa);
        System.out.println("----------------");

        }

        System.out.println("Total number of students: "+students.size());
        System.out.println("Is the students list empty:"+students.isEmpty());
        System.out.println("Is student object no2 in the list: "+students.contains(student2));

        System.out.println("Enter Student id");
        String id=scanner.nextLine();
        boolean found1 = false;

        for(Student s : students){
            if(s.id.equals(id)){
                System.out.println(s.name);
                found1=true;
                break;
            }
        }
    
        if (!found1) {
        System.out.println("Student not found");
        }

        //delete student using student id
        System.out.print("Enter Student ID to delete: ");
        String id2=scanner.nextLine();

        boolean found2 = false;

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).id.equals(id2)) {
            students.remove(i);
            System.out.println("Student deleted successfully.");
            found2 = true;
            break;
            }
        }

        if (!found2) {
        System.out.println("Student not found.");
        }

        System.out.println("Student list after deletion");
        for(Student s : students){

        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("GPA: " + s.gpa);
        System.out.println("----------------");

        }
    }
}
