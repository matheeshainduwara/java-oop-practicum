/*
Question 3: Employee Hierarchy

Create a Java program that models an employee hierarchy using inheritance.

The program should:
- Create a parent class named `Employee`.
- Store common employee information in the parent class.
- Create child classes named `Manager`, `Developer`, and `Intern` that inherit from the `Employee` class.
- Add attributes specific to each employee role.
- Create objects of each child class and display their information.
 */

class Employee{
    String name;
    String empId;
    double salary;
}

class Manager extends Employee{
    int managerLevel;
}

class Developer extends Employee{
    String techStack;
}

class Intern extends Employee{
    int months;
}
public class EmployeeHierarchy {
    public static void main(String[] args) {

        Manager manager1=new Manager();

        manager1.name="AKD Kumara";
        manager1.empId="EMP0026";
        manager1.salary=65834.07;
        manager1.managerLevel=2;

        Developer developer1=new Developer();

        developer1.name="LM Perera";
        developer1.empId="EMP0101";
        developer1.salary=45301.50;
        developer1.techStack="Java";

        Intern intern1= new Intern();

        intern1.name="KW Dissanayake";
        intern1.empId="INT0297";
        intern1.salary=21072.80;
        intern1.months=6;

        System.out.println("Employee Details");
        System.out.println("----------------");

        System.out.println("Name: "+manager1.name);
        System.out.println("Employee Id: "+manager1.empId);
        System.out.println("Salary: "+manager1.salary);
        System.out.println("Level: "+manager1.managerLevel);
        System.out.println("----------------");


        System.out.println("Name: "+developer1.name);
        System.out.println("Employee Id: "+developer1.empId);
        System.out.println("Salary: "+developer1.salary);
        System.out.println("Tech Stack: "+developer1.techStack);
        System.out.println("----------------");


        System.out.println("Name: "+intern1.name);
        System.out.println("Employee Id: "+intern1.empId);
        System.out.println("Salary: "+intern1.salary);
        System.out.println("Internship Months: "+intern1.months);

        
    }
}
