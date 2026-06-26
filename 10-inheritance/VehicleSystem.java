/*
Question 2: Vehicle System

Create a Java program that represents different types of vehicles using inheritance.

The program should:
- Create a parent class named `Vehicle`.
- Store common vehicle information in the parent class.
- Create child classes named `Car`, `Bike`, and `Bus` that inherit from the `Vehicle` class.
- Add attributes unique to each vehicle type.
- Create objects of each child class and display their details.
 */

class Vehicle{
    String brand;
    int year;

    public Vehicle(String brand,int year){
        this.brand=brand;
        this.year=year;
    }
}

class Car extends Vehicle{
    boolean hasAC;

    public Car(String brand,int year,boolean hasAC){
        super(brand,year);
        this.hasAC=hasAC;

    }
}

class Bike extends Vehicle{
    int engineCapacity;

    public Bike(String brand,int year,int engineCapacity){
        super(brand,year);
        this.engineCapacity=engineCapacity;

    }

}

class Bus extends Vehicle{
    int noOfSeats;

    public Bus(String brand,int year,int noOfSeats){
        super(brand,year);
        this.noOfSeats=noOfSeats;

    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        
        Car car1=new Car("Toyota", 2010, true);

        System.out.println("Car Brand: "+car1.brand);
        System.out.println("Manufactured Year: "+car1.year);
        System.out.println("Has AC: "+car1.hasAC);
        System.out.println("----------------");

        Bike bike1=new Bike("Pulsar", 2025, 200);

        System.out.println("Bike Brand: "+bike1.brand);
        System.out.println("Manufactured Year: "+bike1.year);
        System.out.println("Engine Capacity: "+bike1.engineCapacity);
        System.out.println("----------------");

        Bus bus1=new Bus("Kinglong", 2020, 60);

        System.out.println("Bus Brand: "+bus1.brand);
        System.out.println("Manufactured Year: "+bus1.year);
        System.out.println("No of Seats: "+bus1.noOfSeats);
        System.out.println("----------------");


    }
}
