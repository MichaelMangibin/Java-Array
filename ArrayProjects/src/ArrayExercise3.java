// Write a Java program that creates an array of 5 integers and prompts the user to enter 5 intger values to fill the array.
// The program should then fond the sum of all the elements in the array and print the result.

// import java utility for user input
import java.util.Scanner;


public class ArrayExercise3 {
    public static void main(String[] args)
    {
        // create an integer array with five elements
        int[] arr = new int[5];
        
        // create a Scanner object to get user input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter five integer to fill the array");
        
        // prompt the user to enter 5 intger values to fill the array
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter value #" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        
        // initialize a variable to hold the sum of the array's values
        int sum = 0;
        
        // use a for loop to iterate through each element of the array and add it to the sum
        for(int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
        
        // print the sum of the array's values
        System.out.println("The sum of the array's values is: " + sum);
    }
}
