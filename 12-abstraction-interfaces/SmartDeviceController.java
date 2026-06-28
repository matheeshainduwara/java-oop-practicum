/*
Question 3: Smart Device Controller

Create a Java program that controls different smart devices using an interface.

The program should:
- Create an interface named `SmartDevice`.
- Declare a method named `turnOn()` (or another suitable control method).
- Create classes named `SmartLight`, `SmartFan`, and `SmartTV` that implement the `SmartDevice` interface.
- Provide a specific implementation of the control method in each class.
- Create objects of each smart device and demonstrate their functionality.
 */

interface SmartDevice{
    void turnOn();
}

class SmartLight implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("Smart Light is Turned On...");
    }
}

class SmartFan implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("Smart Fan is Turned On...");
    }
}

class SmartTV implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("Smart Tv is Turned On...");
    }
}

public class SmartDeviceController {
    public static void main(String[] args) {
        
        SmartDevice smartDevice1=new SmartLight();
        SmartDevice smartDevice2=new SmartFan();
        SmartDevice smartDevice3=new SmartTV();

        smartDevice1.turnOn();
        smartDevice2.turnOn();
        smartDevice3.turnOn();
    }
}
