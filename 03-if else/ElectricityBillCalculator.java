/*
Question 3: Electricity Bill Calculator

Create a Java program that calculates a customer's electricity bill based on the number of units consumed.

The program should:
- Accept the number of units consumed from the user.
- Apply different charging rates according to the consumption range.
- Calculate and display the total electricity bill.

Use the following rate structure:
- 0–100 units: Rs. 15 per unit
- 101–200 units: Rs. 25 per unit
- 201+ units: Rs. 35 per unit

Display a clear bill summary showing the units consumed and the total amount to be paid.
 */

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number of Units: ");
        int units=scanner.nextInt();
        int bill=0;

        if(units>0 && units<=100){
            bill=(units*15);
        }

        if(units>0 && units<=200){
            bill=(100*15)+(units-100)*25;
        }
        
        if(units>200){
            bill=(100*15)+(100*25)+(units-200)*35;
        }

        double tax= (bill*5)/100;
    

        System.out.println("Electricity Bill Report");
        System.out.println("-----------------------");

        System.out.println("Number of Units: "+units);
        System.out.println("Energy Charge: "+bill);
        System.out.println("Tax(5%): "+tax);
        System.out.println("Total Bill: "+(bill+tax));
        
    }
}