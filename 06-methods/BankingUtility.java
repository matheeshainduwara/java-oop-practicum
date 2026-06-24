/*
Question 2: Banking Utility
Create a Java program that simulates basic banking operations using methods.

The program should:
- Allow money to be deposited into an account.
- Allow money to be withdrawn from an account.
- Display the current account balance.
- Prevent invalid transactions such as withdrawing more money than the available balance.

Implement each banking operation as a separate method.
 */

import java.util.Scanner;

public class BankingUtility {

    
    public static Double depositAcc(double accBalance,double depositAmount){
        return accBalance+depositAmount;
    }
    public static Double withdrawAcc(double accBalance,double withdrawAmount){
        return accBalance-withdrawAmount; 
    }

    public static void main(String[] args) {
        double accBalance= 15490.70;
        double newBalance=accBalance;
        double minimumBal=2000;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Choice: 1-Deposit | 2-Withdraw");
        int choice=scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Deposit Amount: ");
                double depositAmount=scanner.nextDouble();
                newBalance=depositAcc(accBalance, depositAmount);
                System.out.println("Deposit Success. Available Balance is "+newBalance);
                break;
            
            case 2:
                System.out.println("Enter Withdraw Amount: ");
                double withdrawAmount=scanner.nextDouble();
                if(withdrawAmount>accBalance){
                    System.out.println("Can't Proceed. Insufficient Balance");
                }
                else if(accBalance-withdrawAmount<minimumBal){
                    System.out.println("Can't Proceed. Minimum Balance Should be 2000");
                }
                else{
                    newBalance=withdrawAcc(accBalance, withdrawAmount);
                    System.out.println("Withdraw Success. Available Balance is "+newBalance);
                }
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }

    }
}
