/*
Question 1: Vehicle Engine System

Create a Java program that demonstrates abstraction using an abstract class.

The program should:
- Create an abstract class named `Vehicle`.
- Declare an abstract method named `startEngine()`.
- Create child classes such as `Car`, `Bike`, and `Bus` that extend the `Vehicle` class.
- Provide a specific implementation of the `startEngine()` method in each child class.
- Create objects of the child classes and demonstrate how each vehicle starts its engine.
 */

abstract class Vehicle{
    abstract void startEngine();
}

class Car extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("Car engine Started...");
    }
}

class Bike extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("Bike engine Started...");
    }
}

class Bus extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("Bus engine Started...");
    }
}

public class VehicleEngineSystem {
    public static void main(String[] args) {
        
        Vehicle vehicle1=new Car();
        vehicle1.startEngine();

        Vehicle vehicle2=new Bike();
        vehicle2.startEngine();

        Vehicle vehicle3=new Bus();
        vehicle3.startEngine();
    }
}
