/*
Question 1: Safe Calculator
Create a Java calculator program that safely handles calculation errors.

The program should:
- Accept two numbers from the user.
- Perform division.
- Handle `ArithmeticException` when division by zero occurs.
- Display a clear error message instead of crashing the program.
 */

import java.util.Scanner;

public class SafeCalculator{
    public static void main(String[] args) {
        
    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter First Number: ");
    int num1=scanner.nextInt();

    System.out.println("Enter Second Number: ");
    int num2=scanner.nextInt();

    try {
        System.out.println("Division: "+num1/num2);   
    } 
    catch (Exception e) {
        System.out.println("Cannot divide by zero.");
    }
    
    }
}