/*
## Project 1: Student Management System

Develop a console-based Java application that manages student information.

The system should allow users to:
- Add new students.
- View all registered students.
- Search for a student using an ID or name.
- Delete a student from the system.

Each student should contain information such as student ID, name, age, course, GPA, and other relevant details.
 */

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String id;
    String name;
    int age;
    String course;
    double gpa;

    public Student(String id,String name,int age,String course,double gpa){
        this.id=id;
        this.name=name;
        this.age=age;
        this.course=course;
        this.gpa=gpa;
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {

        ArrayList<Student> students=new ArrayList<>(); 

        while (true) {
            
            System.out.println("1-Add new students.");
            System.out.println("2-View all registered students.");
            System.out.println("3-Search for a student using an ID or name.");
            System.out.println("4-Delete a student from the system.");
            System.out.println("5-Exit Program.");
            System.out.println("Select your choice: ");
            System.out.println("---------------------");
            

            Scanner scanner=new Scanner(System.in);
            int choice=scanner.nextInt();
            System.out.println("---------------------");

            switch (choice) {
                case 1:
                    System.out.println("Enter Student's Id: ");
                    String id=scanner.next();
                    scanner.nextLine();
                    System.out.println("Enter Student's Name: ");
                    String name=scanner.next();
                    scanner.nextLine();
                    System.out.println("Enter Student's Age: ");
                    int age=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Student's Course: ");
                    String course=scanner.nextLine();
                    System.out.println("Enter Student's Gpa: ");
                    double gpa=scanner.nextDouble();

                    Student student=new Student(id, name, age, course, gpa);
                    students.add(student);
                    System.out.println("Student added successfully.");
                    System.out.println("---------------------");
                    break;
            
                case 2:

                    if(students.isEmpty()){
                        System.out.println("No students available");
                        System.out.println("---------------------");
                    }
                    else{
                        for(Student s : students){
                            System.out.println("ID: " + s.id);
                            System.out.println("Name: " + s.name);
                            System.out.println("Age: " + s.age);
                            System.out.println("GPA: " + s.gpa);
                            System.out.println("---------------------");
                        }
                    }
                    break;

                case 3:

                    boolean searchFound=false;
                    System.out.println("Enter student id: ");
                    String searchId=scanner.next();
                    System.out.println("---------------------");
                    for(Student s : students){
                        if(s.id.equals(searchId)){
                            System.out.println("Name: " + s.name);
                            System.out.println("Age: " + s.age);
                            System.out.println("GPA: " + s.gpa);
                            System.out.println("---------------------");
                            searchFound=true;
                            break;
                        }
                    }
    
                    if (!searchFound) {
                        System.out.println("Student not found");
                        System.out.println("---------------------");
                    }
                    break;
                
                case 4:

                    boolean deleteFound=false;
                    System.out.println("Enter student id: ");
                    String deleteId=scanner.next();
                    System.out.println("---------------------");

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).id.equals(deleteId)) {
                            students.remove(i);
                            System.out.println("Student deleted successfully.");
                            System.out.println("---------------------");
                            deleteFound = true;
                            break;
                        }
                    }

                    if (!deleteFound) {
                        System.out.println("Student not found.");
                        System.out.println("---------------------");
                    }
                    break;
                    
                case 5:
                    System.out.println("Thank you!");
                    return;  
                
                default:
                    System.out.println("Invalid choice.");
                    System.out.println("---------------------");
                    break;
            }
        }
    }
}
