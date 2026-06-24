/*
Question 2: Course Registration System

Create a Java program that represents university courses using constructors.

The program should:
- Create a class named `Course`.
- Store information about a course, including course name, course code, and number of credits.
- Initialize all attributes using a constructor.
- Create multiple course objects and display their information.
 */

class Course{
    String name;
    String code;
    int credits;

    public Course(String name,String code,int credits){
        this.name=name;
        this.code=code;
        this.credits=credits;
    }
}
public class CourseRegistrationSystem {
    public static void main(String[] args) {
        
        Course course1=new Course("Software Quality Assuarance", "IS3102", 1);
        Course course2=new Course("Advanced Database Management", "IS3103", 2);
        Course course3=new Course("Data Mining", "IS3104", 2);

        System.out.println("------------------------------------");
        System.out.println("Course Name: "+course1.name);
        System.out.println("Course Code: "+course1.code);
        System.out.println("Course Credits: "+course1.credits);
        System.out.println("------------------------------------");
        System.out.println("Course Name: "+course2.name);
        System.out.println("Course Code: "+course2.code);
        System.out.println("Course Credits: "+course2.credits);
        System.out.println("------------------------------------");
        System.out.println("Course Name: "+course3.name);
        System.out.println("Course Code: "+course3.code);
        System.out.println("Course Credits: "+course3.credits);
        System.out.println("------------------------------------");
    }
}
