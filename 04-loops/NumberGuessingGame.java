/*
Question 3: Number Guessing Game
Create a Java program that simulates a simple number guessing game.

The program should:
- Store a secret number.
- Continuously ask the user to enter a guess.
- Compare the user's input with the secret number.
- Display appropriate messages for correct and incorrect guesses.
- Count and display the total number of attempts taken to find the correct number.

The game should continue until the user successfully guesses the correct number.
 */

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        
        int secreatNum=34;
        Scanner scanner = new Scanner(System.in);
        int num=0;
        int attempts=0;

        while(num!=secreatNum){
            System.out.println("Enter the Number: ");
             num = scanner.nextInt();
             attempts=attempts+1;
             if (num==secreatNum) {
                System.out.println("Answer is Correct");
             }
             else{
                System.out.println("Wrong answer. Try again");
             }
             
             System.out.println("Your Attemps: "+attempts);

        }
        
    }
}
