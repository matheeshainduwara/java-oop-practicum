/*
Question 1: Bank Account

Create a Java program that models a bank account using encapsulation.

The program should:
- Create a class named `BankAcc`.
- Keep the account balance private.
- Use setter methods to update the balance.
- Prevent the balance from becoming negative.
- Use getter methods to display the current balance.
*/

class BankAcc{
    private double Balance;
    public double minimumBalance=2000;

    //getter
    public double getBalance(){
        return Balance;
    }

    //setter
    public void setBalance(double Balance){
        if(Balance>=0){
            this.Balance=Balance;
        }
        else{
            System.out.println("Balance Can't be Negative");
        }
    }

    //method for diposit
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Deposit Value Can't be Minus or Zero");
        }
        else{
            Balance=Balance+amount;
        }
    }

    //method for withdraw
    public void withdraw(double amount){
        if (amount>Balance){
            System.out.println("Withdraw Can't Process. Insufficient balance");
        }
        else if ((Balance-amount)<minimumBalance){
            System.out.println("Withdraw Can't Process. Minimum Balance Should Be "+minimumBalance);
        }
        else{
            Balance=Balance-amount;
        }
    }
    
}

public class BankAccount {
    public static void main(String[] args) {
        
        BankAcc account1 = new BankAcc();
        account1.setBalance(-10000);

        System.out.println("------------------------------");

        BankAcc account2 = new BankAcc();
        account2.setBalance(10000);
        System.out.println("Available Balance is: "+account2.getBalance());

        System.out.println("------------------------------");

        BankAcc account3 = new BankAcc();
        account3.setBalance(10000);
        account3.deposit(0);
        System.out.println("Available Balance is: "+account3.getBalance());

        System.out.println("------------------------------");

        BankAcc account4 = new BankAcc();
        account4.setBalance(10000);
        account4.deposit(5000);
        System.out.println("Available Balance is: "+account4.getBalance());

        System.out.println("------------------------------");

        BankAcc account5 = new BankAcc();
        account5.setBalance(10000);
        account5.withdraw(12000);
        System.out.println("Available Balance is: "+account5.getBalance());

        System.out.println("------------------------------");

        BankAcc account6 = new BankAcc();
        account6.setBalance(10000);
        account6.withdraw(8500);
        System.out.println("Available Balance is: "+account6.getBalance());

        System.out.println("------------------------------");

        BankAcc account7 = new BankAcc();
        account7.setBalance(10000);
        account7.withdraw(5600);
        System.out.println("Available Balance is: "+account7.getBalance());


       

       
    }
}
