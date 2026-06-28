/*
Question 2: Student Marks Validator
Create a Java program that validates student marks.

The program should:
- Accept marks from the user.
- Reject marks below 0.
- Reject marks above 100.
- Display a valid message only when marks are within the correct range.
 */

import java.util.Scanner;

public class StudentMarksValidator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Marks: ");
        int marks=scanner.nextInt();

        try {
            if(marks<0 || marks>100){
                throw new Exception("Marks must be between 0 and 100.");
            }
            System.out.println("Marks Accepted");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
