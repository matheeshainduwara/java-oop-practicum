/*
Question 3: Login Attempt System
Create a Java login program that handles invalid login attempts.

The program should:
- Accept a username and password from the user.
- Reject empty usernames.
- Detect wrong passwords.
- Handle invalid input properly.
- Display clear messages for successful and failed login attempts.
 */

import java.util.Scanner;

public class LoginAttemptSystem {
    public static void main(String[] args) {
        
    String password="Admin1234";

    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter Username: ");
    String username=scanner.nextLine();

    System.out.println("Enter Password: ");
    String pw=scanner.nextLine();

    try {
        if(username.isEmpty()){
            throw new Exception("Username Can't be Empty");
        }
        if(!password.equals(pw)){
            throw new Exception("Invalid Password");
        }
        System.out.println("Login Successful");

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    }
}
