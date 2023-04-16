// Check if a string of parentheses is balanced, meaning each opening parenthesis
// has a corresponding closing parenthesis in the correct order.
// the output of each check should be either true or false.
// use the following examples to be evaluated:
// parentheses1 = ((()))
// parentheses2 = (()())
// parentheses3 = (()
// parentheses4 ())

// import java utility
import java.util.*;

public class StackExercise1 {
    public static boolean isBalanced(String parentheses)
    {
        // create a stack to keep track of opening prentheses
        Stack<Character> stack = new Stack<Character>();
        
        // loop through each character in the string
        for(int i = 0; i < parentheses.length(); i++)
        {
            char c = parentheses.charAt(i);
            
            // if the character is an opening parenthesis, push it onto the stack
            if(c == '(')
            {
                stack.push(c);
            }
            
            // if the character is a closing parenthesis, check if the stack is empty
            // or if the top of the stack is a matching opening parenthesis
            else if(c == ')')
            {
                if(stack.isEmpty() || stack.peek() != '(')
                {
                    return false;
                }
                else
                {
                    stack.pop();
                }
            }
        }
        // after looping through all cahracters, if the stack is empty, the parentheses
        // are balanced
        return stack.isEmpty();
    }
    
    public static void main(String[] args)
    {
        // test cases
        String parentheses1 = "((()))";
        String parentheses2 = "()()";
        String parentheses3 = "(";
        String parentheses4 = ")";
        
        // check if each string of parentheses is balanced and print the result
        System.out.println(isBalanced(parentheses1)); // true
        System.out.println(isBalanced(parentheses2)); // true
        System.out.println(isBalanced(parentheses3)); // false
        System.out.println(isBalanced(parentheses4)); // false
    }
}
