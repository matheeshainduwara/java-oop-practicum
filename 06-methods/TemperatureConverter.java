/*
Question 3: Temperature Converter
Create a Java program that converts temperature values between Celsius and Fahrenheit using methods.

The program should:
- Accept a temperature value from the user.
- Convert Celsius to Fahrenheit using a dedicated method.
- Convert Fahrenheit to Celsius using a separate method.
- Display the converted temperature values clearly.
 */

import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsiusValue){
        return (celsiusValue*9/5)+32;
    }
    public static double fahrenheitToCelsius(double fahrenheitValue){
        return ((fahrenheitValue-32)*5)/9;
    }
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Choice: 1-Celsius to Fahrenheit | 2-Fahrenheit to Celsius");
        int choice=scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Celsius Value(C)");
                double celsiusValue=scanner.nextDouble();
                System.out.println("Fahrenheit Value is: "+celsiusToFahrenheit(celsiusValue)+"C");
                break;
            
            case 2:
                System.out.println("Enter Fahrenheit Value(F)");
                double fahrenheitValue=scanner.nextDouble();
                System.out.println("Fahrenheit Value is: "+fahrenheitToCelsius(fahrenheitValue)+"F");
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }

    }
}