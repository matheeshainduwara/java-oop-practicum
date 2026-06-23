/*
Question 1: Student Marks Analyzer
Create a Java program that analyzes a collection of student marks stored in an array.

The program should:
- Store multiple student marks in an array.
- Find the highest mark.
- Find the lowest mark.
- Calculate the average mark.

Display a summary report showing all calculated results.
*/

import java.util.Scanner;

public class StudentMarksAnalyzer {

    public static void main(String[] args) {
        
        int[] marks= new int[5];
        Scanner scanner=new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("Enter Marks: ");
            marks[i] = scanner.nextInt();
        }

        int highest= marks[0];
        int lowest= marks[0];
        int count=0;

        for(int j=0;j<5;j++){
            if(highest<marks[j]){
                highest=marks[j];
            }
             if(lowest>marks[j]){
                lowest=marks[j];
            }
            count=count+marks[j];
        }
        System.out.println("Summary Report");
        System.out.println("----------------");
         System.out.println("Highest Mark: "+highest);
         System.out.println("Lowest Mark: "+lowest);
         System.out.println("Average Mark: "+(count/5));
    }
}