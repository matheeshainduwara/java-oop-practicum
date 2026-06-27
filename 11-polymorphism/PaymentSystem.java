/*
Question 2: Payment System

Create a Java program that simulates different payment methods using polymorphism.

The program should:
- Create a parent class named `Payment`.
- Declare a method named `processPayment()`.
- Create child classes named `Visa`, `MasterCard`, and `PayPal` that inherit from the `Payment` class.
- Override the `processPayment()` method in each child class to display a payment process specific to that payment method.
- Create objects of each payment type and invoke the payment process.
 */

class Payment{
    public void processsPayment(){
        System.out.println("Payment is Processing...");
    }
}

class Visa extends Payment{
    @Override
    public void processsPayment(){
        System.out.println("Processing Visa payment using card verification and bank authorization");
    }
}

class Marstercard extends Payment{
    @Override
    public void processsPayment(){
        System.out.println("Processing MasterCard payment using card network authorization");
    }
}

class Paypal extends Payment{
    @Override
    public void processsPayment(){
        System.out.println("Processing PayPal payment by logging into the PayPal account and confirming the transfer");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        
        Payment payment1=new Visa();
        Payment payment2=new Marstercard();
        Payment payment3=new Paypal();

        payment1.processsPayment();
        payment2.processsPayment();
        payment3.processsPayment();

    }
}
