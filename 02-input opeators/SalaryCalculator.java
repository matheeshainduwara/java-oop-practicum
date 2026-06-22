/*
Question 3: Salary Calculator

Input:
-Basic Salary
-Allowance
-Overtime Hours

Calculate final salary. 
*/

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Basic Salary: ");
        double basic = scanner.nextDouble();
        System.out.println("Enter Allowance(Per Hour): ");
        double allowance = scanner.nextDouble();
        System.out.println("Overtime Hours: ");
        double othours = scanner.nextDouble();

        double otpayment=(allowance*othours);
        double finalSalary=(basic+otpayment);

        System.out.println("Final Salary: "+finalSalary);
        

    }
}
