// Write a series of code that;
// Pushes three elements onto the stack - Alice, Bob, Charlie
// Pops the pushed elements
// Prints the popped elements using system.out.println(observe how LIFO is applied)
// Check if the stack is empty (this should return true)

// import java utility

import java.util.*;

public class StackExercise2 {
    public static void main(String[] args)
    {
        // create a stack of strings
        Stack<String> stack = new Stack<String>();
        
        // Push three elements onto the stack
        stack.push("Alice");
        stack.push("Bob");
        stack.push("Chralie");
        
        // pop the pushed elements and print them using LIFO order
        while(!stack.isEmpty())
        {
            String popped = stack.pop();
            System.out.println(popped);
        }
        
        // check of the stack is empty
        System.out.println(stack.isEmpty()); // should return true
    }
}
