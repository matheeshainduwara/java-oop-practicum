/*
Question 3: Employee Database

Create a Java program that manages employee records using constructors.

The program should:
- Create a class named `Employee`.
- Store employee details such as name, employee ID, and salary.
- Use constructors to initialize employee objects.
- Create multiple employee objects and display their records in a structured format.
 */

class Employee{
    String name;
    String empId;
    double salary;

    public Employee(String name,String empId,double salary){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
    }
}
public class EmployeeDatabase {
    public static void main(String[] args) {
        
        Employee emp1=new Employee("Kamal", "EMP001", 35000);
        Employee emp2=new Employee("Saduni", "EMP035", 55000);
        Employee emp3=new Employee("Ravindu", "EMP120", 45000);

        System.out.println("------------------------------------");
        System.out.println("Employee Name: "+emp1.name);
        System.out.println("Employee ID: "+emp1.empId);
        System.out.println("Employee Salary: "+emp1.salary);
        System.out.println("------------------------------------");
        System.out.println("Employee Name: "+emp2.name);
        System.out.println("Employee ID: "+emp2.empId);
        System.out.println("Employee Salary: "+emp2.salary);
        System.out.println("------------------------------------");
        System.out.println("Employee Name: "+emp3.name);
        System.out.println("Employee ID: "+emp3.empId);
        System.out.println("Employee Salary: "+emp3.salary);
        System.out.println("------------------------------------");
        
    }
}
