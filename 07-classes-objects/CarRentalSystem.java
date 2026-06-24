/*
Question 2: Car Rental System
Create a Java program that represents a car rental service using a class.

The program should:
- Create a class named `Car`.
- Store information about a car, including its brand, model, and daily rental rate.
- Create multiple car objects.
- Assign values to each car's attributes.
- Display the details of the available rental cars.
 */

class Car{
    String brand;
    String model;
    double dailyRentalRate;
}
public class CarRentalSystem {
    public static void main(String[] args) {
        
        Car car1=new Car();

        car1.brand="Toyota";
        car1.model="Raize";
        car1.dailyRentalRate=2000.00;

        Car car2=new Car();

        car2.brand="Honda";
        car2.model="Vezel";
        car2.dailyRentalRate=3500.00;

        System.out.println("Car Brand: "+car1.brand);
        System.out.println("Car Model: "+car1.model);
        System.out.println("Daily Rental Rate: "+car1.dailyRentalRate);
        System.out.println("----------------------");
         System.out.println("Car Brand: "+car2.brand);
        System.out.println("Car Model: "+car2.model);
        System.out.println("Daily Rental Rate: "+car2.dailyRentalRate);

    }
}
