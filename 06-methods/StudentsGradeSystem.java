/*
Question 1: Student Grade System
Create a Java program that uses methods to manage and evaluate student academic performance.

The program should:
- Store marks for multiple subjects.
- Calculate the student's average mark using a dedicated method.
- Determine the student's grade based on the calculated average using a separate method.
- Display all results in a formatted report using another method.
 */

import java.util.Scanner;

public class StudentsGradeSystem {

    public static double calculateAverage(double count,int marks[]){
            return (double)count/marks.length;
        }   
        
    public static String getGrade(double avg) {
        String grade;
        if(avg>=75){
           grade = "A";
        }
        else if(avg>=65){
            grade="B";
        }
        else if(avg>=55){
            grade="C";
        }
        else if(avg>=35){
            grade="S";
        }
        else{
            grade="F";
        }
        return grade;
    }   
    
    public static void main(String[] args) {
        int[] marks= new int[5];
        int count=0;

        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter Marks: ");
            marks[i]=scanner.nextInt();
            count=count+marks[i];
        }
        double avg=calculateAverage(count, marks);
        System.out.println("Average Mark is: "+avg);
        System.out.println("Average Grade is: "+getGrade(avg));
        
    }   
}
