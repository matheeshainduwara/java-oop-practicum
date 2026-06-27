/*
Question 1: Shape Area Calculator

Create a Java program that calculates the area of different shapes using polymorphism.

The program should:
- Create a parent class named `Shape`.
- Declare a method named `calculateArea()`.
- Create child classes named `Circle`, `Rectangle`, and `Triangle` that inherit from the `Shape` class.
- Override the `calculateArea()` method in each child class to calculate the area based on its own formula.
- Create objects of each shape and display their calculated areas. 
*/

class Shape{

    public void calculateArea(){
        System.out.println("Area Calculated");
    }
    
}

class Circle extends Shape{
    double radius;
    double pi=3.142;
    
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area of the circle is: "+(pi*radius*radius));
    }
}

class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area of the rectangle is: "+(width*length));
    }
}

class Triange extends Shape{
    double height;
    double base;

    public Triange(double height,double base){
        this.height=height;
        this.base=base;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area of the triangle is: "+(0.5*height*base));
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {

        Shape shape1=new Circle(5);
        shape1.calculateArea();

        Shape shape2=new Rectangle(4, 8);
        shape2.calculateArea();

        Shape shape3=new Triange(4, 6);
        shape3.calculateArea();
    }
}
