/*
Question 3: Academic Summary Generator

Create a Java program that stores:
- Total Credits
- Completed Credits
- GPA

Calculate the percentage of degree completion
and display an academic summary report.
*/

public class AcademicSummaryGenerator {
    public static void main(String[] args) {
        
        int totalCredits=120;
        int completedCredits=58;
        double GPA=3.48;
        double degreeProgress=((double)completedCredits/totalCredits)*100;

        System.out.println("Academic Summery Report");
        System.out.println("-----------------------");

        System.out.println("Total Credits: "+totalCredits);
        System.out.println("Completed Credits: "+completedCredits);
        System.out.println("GPA: "+GPA);
        System.out.printf("Degree Progress: %.2f%%", degreeProgress);

    }
}
