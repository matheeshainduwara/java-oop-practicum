/*
Question 2: Student GPA Validation

Create a Java program that stores a student's GPA using encapsulation.

The program should:
- Create a class named `Student`.
- Store the GPA as a private attribute.
- Use a setter method to validate the GPA.
- Allow only GPA values between 0.0 and 4.0.
- Display the GPA using a getter method.

If the entered GPA is outside the valid range, display an appropriate validation message and do not update the GPA.
*/

class Student{
    private double GPA;

    //setter
    public void setGPA(double GPA){
        if(GPA>=0.0 && GPA<=4.0){
            this.GPA=GPA;
        }
        else{
            System.out.println("GPA is outside the Valid range");
        }
    }

    //getter
    public double getGPA(){
        return GPA;
    }

}
public class StudentGpaValidation {
    public static void main(String[] args) {

        Student student1=new Student();

        student1.setGPA(4.08);
        System.out.println("Updated GPA is: "+student1.getGPA());

        System.out.println("------------------------------");

        Student student2=new Student();

        student2.setGPA(3.48);
        System.out.println("Updated GPA is: "+student2.getGPA());
    }
}
