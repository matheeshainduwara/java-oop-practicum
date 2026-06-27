/*
Question 3: Notification System

Create a Java program that sends notifications using polymorphism.

The program should:
- Create a parent class named `Notification`.
- Declare a method named `sendNotification()`.
- Create child classes named `EmailNotification`, `SMSNotification`, and `PushNotification` that inherit from the `Notification` class.
- Override the `sendNotification()` method in each child class to display a notification message specific to that notification type.
- Create objects of each notification type and demonstrate the notification process.
 */

class Notification{
    public void sendNotification(){
        System.out.println("Notification Sent...");
    }
}

class EmailNotification extends Notification{
    public void sendNotification(){
        System.out.println("Notification Sent using Email.");
    }
}

class SMSNotification extends Notification{
    public void sendNotification(){
        System.out.println("Notification Sent using SMS.");
    }
}

class PushNotification extends Notification{
    public void sendNotification(){
        System.out.println("Notification Sent using Popup.");
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        
        Notification notification1=new EmailNotification();
        Notification notification2=new SMSNotification();
        Notification notification3=new PushNotification();

        notification1.sendNotification();
        notification2.sendNotification();
        notification3.sendNotification();
    }
}
