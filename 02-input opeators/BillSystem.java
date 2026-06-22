/*
Question 2: Mobile Shop Bill System

Input:
-Product Name
-Quantity
-Unit Price

Calculate:
-Subtotal
-Tax (10%)
-Final Amount
*/

import java.util.Scanner;

public class BillSystem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Product Name: ");
        String product= scanner.nextLine();
        System.out.println("Enter Unit Price: ");
        double unit=scanner.nextDouble();
        System.out.println("Enter Quantity: ");
        int quantity=scanner.nextInt();

        double total=(unit*quantity);
        double tax=(total*10)/100;
        double finalAmount=(total+tax);

        System.out.println("Product Name: "+product);
        System.out.printf("Sub total: %.2f\n",total);
        System.out.println("Tax(10%): "+tax);
        System.out.printf("Final Amount: %.2f\n",finalAmount);

    }
}
 