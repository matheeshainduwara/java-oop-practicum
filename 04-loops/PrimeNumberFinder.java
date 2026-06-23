/*
Question 2: Prime Number Finder
Create a Java program that identifies and displays all prime numbers between 1 and 100.

The program should:
- Check each number within the given range.
- Determine whether it is a prime number.
- Display all prime numbers found.
*/

public class PrimeNumberFinder {
    public static void main(String[] args) {

       

        for(int i=2;i<=100;i++){
            boolean isPrime=true;
            
           for(int j=2;j<i;j++){
             
                if(i%j==0){
                    isPrime=false;
                    break;
                }
           }
           if(isPrime){
            System.out.println(i);
           }
                
            
        }
        
    }
}
