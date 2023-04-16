// Create a lis with the following elements - apple, banana, and cherry.
// Write a code that accomplishes the following;
// Print the list using println
// Add orange to the beginning of the list
// Print the list again
// Remove an element from the list
// Print the list again
// Get an element at a specific index
// Print the size of the list

// Import java LinkedList Utility
import java.util.LinkedList;


public class LinkedListExercise1 {
    public static void main(String[] args) 
    {
        // create a linked list with elements "apple", "banana, and "cherry"
        LinkedList<String> fruits = new LinkedList <>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        
       // Print the list
        System.out.println("Original List: " + fruits);
        
        // add "oragne to the beginning of the list
        fruits.addFirst("Orange");
        
        // Print the new list
        System.out.println("The new list is: " + fruits);
        
        // remove an element from the list
        fruits.remove(2);
        
        // Print the list after removing an element 2
        System.out.println("List after removing an element: " + fruits);
        
        // get element at a specific index
        String element = fruits.get(1);
        
        // Print the index 1 element
        System.out.println("Element at index 1: " + element);
        
        // Print the size of the list
        int size = fruits.size();
        System.out.println("Size of the list: " + size);
    }
}
