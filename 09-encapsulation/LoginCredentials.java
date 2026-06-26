/*
Question 3: Login Credentials

Create a Java program that manages user login credentials using encapsulation.

The program should:
- Create a class named `User`.
- Store the password as a private attribute.
- Use a setter method to validate the password before saving it.
- Accept only passwords with a minimum length of 8 characters.
- Display a success or validation message based on the entered password.
 */

class User{
    private String password;

    public void setpassword(String password){
        if(password.length()<8){
            System.out.println("Enter password with a minimum length of 8 charactors");
        }
        else{
            this.password=password;
        }
    }

    public String getpassword(){
        return password;
    }
}
public class LoginCredentials {
    public static void main(String[] args) {
        
        User user1=new User();
        
        user1.setpassword("Java");
        System.out.println("Password is: "+user1.getpassword());

        System.out.println("------------------------------");

        User user2=new User();

        user2.setpassword("Java12345");
        System.out.println("Password is: "+user2.getpassword());

        

    }
}
