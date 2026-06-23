/*
Question 1: Scholarship Eligibility Checker

Conditions:
GPA > 3.5
Attendance >= 80%

Output:
Eligible / Not Eligible
 */

import java.util.Scanner;

public class ScholarshipEligibilitySystem {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Your GPA: ");
        double gpa= scanner.nextDouble();
        System.out.println("Enter Your Attendance(%): ");
        double attendance= scanner.nextDouble();

        if (gpa>3.5 && attendance>=80) {
            System.out.println("Eligible for the Scholarship");
        }
        else{
            System.out.println("Not Eligible for the Scholarship");
        }
    }
}
