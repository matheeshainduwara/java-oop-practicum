/*
Project 3: Banking System

Develop a console-based banking application that simulates basic banking operations.

The system should allow users to:
- Deposit money into an account.
- Withdraw money while validating available balance.
- Transfer money between accounts.
- View transaction history.

Each account should contain information such as account number, account holder name, balance, and transaction records.
The application should validate user inputs and prevent invalid operations such as negative balances or invalid transaction amounts.
*/

import java.util.ArrayList;
import java.util.Scanner;

class Account{
    int accNum;
    String accHolder;
    double balance=0;

    public Account(int accNum,String accHolder,double balance){
        this.accNum=accNum;
        this.accHolder=accHolder;
         if(balance>=2000){
            this.balance=balance;
            System.out.println("New account added successfully");
        }
        else{
            System.out.println("Minimum 2000 needed.Try again ");
        }
        
    }

    ArrayList<String> history = new ArrayList<>();
}
public class BankingSystem {
    public static void main(String[] args) {
        
        ArrayList<Account> accounts=new ArrayList<>();

        while (true) {
            System.out.println("1-Create Account");
            System.out.println("2-Deposit");
            System.out.println("3-Withdraw");
            System.out.println("4-Transfer");
            System.out.println("5-Transaction History");
            System.out.println("6-View Accounts");
            System.out.println("7-Exit");

            Scanner scanner=new Scanner(System.in);
            System.out.println("Select your choice: ");
            int choice=scanner.nextInt();
            System.out.println("---------------------");

            switch (choice) {
                case 1:
                    System.out.println("Enter Account Number: ");
                    int accNum=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Account Holder: ");
                    String accHolder=scanner.nextLine();
                    System.out.println("Enter Balance: ");
                    double balance=scanner.nextDouble();

                    Account account=new Account(accNum, accHolder, balance);
                    accounts.add(account);
                    System.out.println("---------------------");   
                    break;
                
                case 2:
                    boolean depositFound=false;
                    System.out.println("Enter Account num: ");
                    int depositAccnum=scanner.nextInt();
                    for(Account a:accounts){
                        if(a.accNum==depositAccnum){
                            System.out.println("Enter Amount: ");
                            double depositamount=scanner.nextDouble();
                            a.balance=(a.balance+depositamount);
                            System.out.println("Deposit Successfull.New balance is: "+(double)a.balance);
                            System.out.println("---------------------");
                            a.history.add("Deposited Rs:"+depositamount);
                            depositFound=true;
                            break;
                        }
                    }
                    if(!depositFound){
                        System.out.println("Account not found");
                        System.out.println("---------------------");
                    }
                    break;

                case 3:
                    boolean withdrawFound=false;
                    System.out.println("Enter Account num: ");
                    int withdrawAccnum=scanner.nextInt();
                    for(Account a:accounts){
                        if(a.accNum==withdrawAccnum){
                            System.out.println("Enter Amount: ");
                            double withdrawamount=scanner.nextDouble();
                            if(a.balance-withdrawamount<2000){
                                System.out.println("Can't withdraw "+withdrawamount+". You can withdraw maximum "+(a.balance-2000));
                                System.out.println("---------------------");
                                a.history.add("Withdrawn Rs:"+withdrawamount);
                                withdrawFound=true;
                                break;
                            }
                            else{
                                a.balance=(a.balance-withdrawamount);
                                System.out.println("Withdraw successfull.Available balance is: "+(double)a.balance);
                                System.out.println("---------------------");
                                withdrawFound=true;
                                break;   
                            }     
                        }
                    }
                    if(!withdrawFound){
                        System.out.println("Account not found");
                        System.out.println("---------------------");
                    }
                    break;
                
                case 4:
                    boolean senderFound=false;
                    System.out.println("Enter Sender Account: ");
                    int senderAcc=scanner.nextInt();
                    for(Account a:accounts){
                        if(a.accNum==senderAcc){
                            senderFound=true;
                            boolean receiverFound=false;
                            System.out.println("Enter Receiver Account: ");
                            System.out.println("---------------------");
                            int receiverAcc=scanner.nextInt();
                            if(a.accNum==receiverAcc){
                                System.out.println("Can't Process. Transfer and receiver accounts are same");
                                System.out.println("---------------------");
                                break;
                            }
                            for(Account b:accounts){
                                if(b.accNum==receiverAcc){
                                    System.out.println("Enter amount: ");
                                    double transferAmount =scanner.nextDouble();
                                    if(a.balance<transferAmount || a.balance-transferAmount<2000){
                                        System.out.println("Can't Process.Insufficient Balance");
                                        System.out.println("---------------------");
                                        receiverFound=true;
                                        break;

                                    }
                                    else{
                                        a.balance=(a.balance-transferAmount);
                                        a.history.add("Transfered Rs:"+transferAmount+" to account "+b.accNum);
                                        b.balance=(b.balance+transferAmount);
                                        b.history.add("Received Rs:"+transferAmount+" from account "+a.accNum);
                                        System.out.println("Transaction Successfull");
                                        System.out.println("---------------------");
                                        receiverFound=true;
                                        break;
                                    }
                                }
                            }
                            if(!receiverFound){
                                System.out.println("Receiver account not found");
                                System.out.println("---------------------");
                            }
                        }    
                    }
                    if(!senderFound){
                        System.out.println("Sender account not found");
                        System.out.println("---------------------");
                    }
                    break;

                case 5:
                    boolean historyAccFound=false;
                    System.out.println("Enter account number: ");
                    int historyAcc=scanner.nextInt();
                    for(Account a:accounts){
                        if(historyAcc==a.accNum){
                           historyAccFound=true;
                           System.out.println("Transaction History");
                           System.out.println("---------------------");

                            if (a.history.isEmpty()) {
                                System.out.println("No transactions available.");
                                System.out.println("---------------------");
                            }
                            else {
                                for (String transaction : a.history) {
                                System.out.println(transaction);
                                System.out.println("---------------------");
                                }
                            }
                        }
                    }

                    if (!historyAccFound) {
                        System.out.println("Account not found.");
                        System.out.println("---------------------");
                    }
                    break;
                
                case 6:
                    System.out.println("Account Details");
                    System.out.println("---------------------");
                    for(Account a:accounts){
                        System.out.println("Account Number: "+a.accNum);
                        System.out.println("Account Holder: "+a.accHolder);
                        System.out.println("Current Balance: "+a.balance);
                        System.out.println("---------------------");
                    }
                    break;
                
                case 7:
                    System.out.println("Thank You");
                    return;

                default:
                    System.out.println("Invalid Choice");
                    System.out.println("---------------------");
                    break;
            }    
        }
    }
}
