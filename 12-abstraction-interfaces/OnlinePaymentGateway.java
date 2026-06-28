/*
Question 2: Online Payment Gateway

Create a Java program that demonstrates the use of interfaces.

The program should:
- Create an interface named `Payment`.
- Declare a method named `processPayment()`.
- Create classes named `VisaCard`, `PayPal`, and `BankTransfer` that implement the `Payment` interface.
- Provide a specific implementation of the `processPayment()` method in each class.
- Create objects of each payment method and demonstrate the payment process.
 */

interface Payment{
    void processPayment();
}

class VisaCard implements Payment{
    @Override
    public void processPayment(){
         System.out.println("Processing Visacard Payment...");
    }
}

class PayPal implements Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing Paypal Payment...");
    }
}

class BankTransfer implements Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing Bank transer Payment...");
    }
}
public class OnlinePaymentGateway {
    public static void main(String[] args) {
        
        Payment payment1=new VisaCard();
        payment1.processPayment();

        Payment payment2=new PayPal();
        payment2.processPayment();

        Payment payment3=new BankTransfer();
        payment3.processPayment();
    }
}
