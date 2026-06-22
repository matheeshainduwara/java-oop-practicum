/*
Question 1: Average Calculator

Input marks for 4 subjects.

Calculate:
- Total
- Average
 */

import java.util.Scanner;

public class AvgCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input marks for Subject 1: ");
        double mark1 = scanner.nextInt();
        System.out.println("Input marks for Subject 2: ");
        double mark2 = scanner.nextInt();
        System.out.println("Input marks for Subject 3: ");
        double mark3 = scanner.nextInt();
        System.out.println("Input marks for Subject 4: ");
        double mark4 = scanner.nextInt();

        double total=(mark1+mark2+mark3+mark4);
        double avg=(mark1+mark2+mark3+mark4)/4;

        System.out.println("Total Marks: "+total);
        System.out.println("Average Marks: "+avg);
    }
}
