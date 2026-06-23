/* 
Question 3: Second Largest Number Finder
Create a Java program that finds the two largest values in an array of numbers.

The program should:
- Store multiple numbers in an array.
- Find the largest number.
- Find the second largest number.
- Display both values.

 */

public class SecondLargestNumberFinder {
    public static void main(String[] args) {
        int[] num={34,56,90,12,4};
        int largest=num[0];
        int secondLargest=num[0];
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                secondLargest=largest;
                largest=num[i];
            }
            else if(secondLargest<num[i]){
                secondLargest=num[i];
            }
        }
        System.out.println("Largest Number: "+largest);
        System.out.println("Second Largest Number: "+secondLargest);
    }
}
