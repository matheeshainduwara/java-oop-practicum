/*
Question 1: University System

Create a Java program that models a university using inheritance.

The program should:
- Create a parent class named `Person`.
- Store common information such as name and age in the parent class.
- Create two child classes named `Student` and `Lecturer` that inherit from the `Person` class.
- Add attributes specific to each child class.
- Create objects of both child classes and display their information. 
*/

class Person{
    String name;
    int age;
}

class Student extends Person{
    String studentID;

    public Student(String name,int age,String studentID){
        this.name=name;
        this.age=age;
        this.studentID=studentID;
    }
}

class Lecturer extends Person{
    String lecID;

    public Lecturer(String name,int age,String lecId){
        this.name=name;
        this.age=age;
        this.lecID=lecId;
    }
}
public class UniversitySystem {
    public static void main(String[] args) {

        Student student1=new Student("RM Induwara", 23, "CIS009");

        System.out.println("Student Name: "+student1.name);
        System.out.println("Student Age: "+student1.age);
        System.out.println("Student ID: "+student1.studentID);
        System.out.println("----------------");

        Lecturer lecturer1=new Lecturer("AW Kumara", 42, "CSE011");

        System.out.println("Lecturer Name: "+lecturer1.name);
        System.out.println("Lecturer Age: "+lecturer1.age);
        System.out.println("Lecturer ID: "+lecturer1.lecID);
        System.out.println("----------------");
    }
}
