/*
Question 2: ATM Withdrawal System

Create a Java program that simulates an ATM withdrawal process.

The program should:
- Store the current account balance.
- Accept a withdrawal amount from the user.
- Check whether the account has sufficient funds for the withdrawal.
- Ensure that a minimum balance remains in the account after the withdrawal.

Display appropriate messages based on whether the withdrawal can be completed or not. 
*/

import java.util.Scanner;

public class AtmWithdrawalSystem {
    public static void main(String[] args) {
        
        double currentBalance=15789.56;
        double minimumBalance=2000.00;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Withdrawal Amount in Multiples of 100: ");
        double amount=scanner.nextDouble();
        
        if(amount<currentBalance ){
            if(currentBalance-amount>=minimumBalance){
                double newBalance=(currentBalance-amount);
                System.out.printf("Withdrawal Accepted. Your Balance is %.2f",newBalance);
            }
            else{
            System.out.println("Withdrawal Can't Accept. Minimum 2000 should be in the account.");
            }    
        }
        else{
        System.out.println("Withdrawal Can't Accept. Insufficient Balance.");
        }

    }
}
