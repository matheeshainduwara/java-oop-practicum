/*
Question 3: Salary Calculator

Input:
-Basic Salary
-Allowance
-Overtime Hours
-Tax 5%

Calculate final salary. 
*/

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        
        double otrate=450;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Basic Salary: ");
        double basic = scanner.nextDouble();
        System.out.println("Enter Allowance: ");
        double allowance = scanner.nextDouble();
        System.out.println("Overtime Hours: ");
        double othours = scanner.nextDouble();

        double otpayment=(otrate*othours);
        double finalSalary=(basic+allowance+otpayment);
        double tax=(finalSalary*5)/100;
        double netSalary=(finalSalary-tax);

        

        System.out.println("Salary Report");
        System.out.println("-------------");
        System.out.println("Basic Salary: "+basic);
        System.out.println("Allowance: "+allowance);
        System.out.println("Overtime Pay: "+otpayment);
        System.out.println("Tax: "+tax);
        System.out.println("Net Salary: "+netSalary);
        

    }
}
