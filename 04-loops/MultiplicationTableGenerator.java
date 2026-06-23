/*
Question 1: Multiplication Table Generator
Create a Java program that generates a multiplication table for a number entered by the user.

The program should:
- Accept a number as input.
- Generate and display its multiplication table from 1 to 12.
- Format the output clearly so it is easy to read.
 */

import java.util.Scanner;

public class MultiplicationTableGenerator {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=scanner.nextInt();

        for(int i=1;i<=12;i++){
            System.out.println(num+" x "+ i +" = " +(num*i));
        }
    }
}