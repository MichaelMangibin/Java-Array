// Write a Java program to test if an array contains a specific value. Create an array with five elements.


public class ArrayExercise2 {
    public static void main(String[] args)
    {
        // Declare and initialize the array with five elements
        int[] arr = {3, 7, 12, 6, 18};
    
        // The value we want to check if it's in the array
        int valueToCheck = 6;
        
        // Initialize a boolean variable to keep track if the value is found
        boolean containsValue = false;
        
        // Check if the current element of the array is equal to the value we want to check
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == valueToCheck) {
                
                // if the value is found, set the boolean variable to true
                containsValue = true;
                
                // break the loop since the value was found
                break;
            }
        }
        // check the boolean variable to see if the value was found
        if(containsValue) {
            System.out.println("The array contains the value " + valueToCheck);
        }
        else {
            System.out.println("The array does not contain the value " + valueToCheck);
        }
    }
}
