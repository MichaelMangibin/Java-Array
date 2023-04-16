//binarySearch(array, fromIndex, toIndex, key, Comparator) Method

// Java program to demonstrate
// Arrays.binarySearch() method

import java.util.Arrays;

public class ArrayClassBinarySearchMethod2 {
    public static void main(String[] args)
    {
         // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };
  
        Arrays.sort(intArr);
  
        int intKey = 22;
  
        System.out.println(
            intKey
            + " found at index = "
            + Arrays
                  .binarySearch(intArr, 1, 3, intKey));
    }
}
