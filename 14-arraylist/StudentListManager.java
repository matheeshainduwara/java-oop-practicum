/*
Question 1: Student List Manager

Create a Java program that manages a list of student names using an ArrayList.

The program should:
- Create an `ArrayList<String>` to store student names.
- Add at least five student names to the list.
- Display all student names.
- Display the total number of students using the `size()` method.
- Check whether the student list is empty using the `isEmpty()` method.
- Search for a student by name using the `contains()` method.
- Display an appropriate message if the student exists or does not exist.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StudentListManager {
    public static void main(String[] args) {
    
    ArrayList<String> students= new ArrayList<>();

    //adding students
    students.add("Kesara");
    students.add("Gaviru");
    students.add("Moksha");
    students.add("Janidu");
    students.add("Sathira");
    
    //dislay all students
    for(String student : students){
        System.out.println(student);
    }

    System.out.println("-------------------------");
    System.out.println("Total number of students: "+students.size());
    System.out.println("Is the arraylist empty: "+students.isEmpty());
    
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter Student Name: ");
    String name= scanner.nextLine();

    if(students.contains(name)){
        System.out.println("Student '"+name+"' exists in the list.");
    }
    else{
        System.out.println("Student '"+name+"' does not exists in the list.");
    }
    
}
    
}
