// Write a Java Program that sums the array's values with the following elements: 25, 4, 16, 9, 10.

public class ArrayExercise1 {
    public static void main(String[] args)
    {
        
        // Declare and initialize the array with given elements
        int[] myArray = { 25, 4, 16, 9, 10 };

        // initialize the sum to 0
        int sum = 0;

        // for loop to add each element of the array to the sum
        for(int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        // show the final sum
        System.out.println("The sum of the array elements is: "  + sum);
    }
}