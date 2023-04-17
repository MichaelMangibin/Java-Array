// Simulate a line at a store or bank using queue.
// The program should allow the user to enter a name , "join' the line
// and wait for service. The program should then "serve" customers in the
// order they joined the line.

// import java utilities
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueExercise1 {
    public static void main(String[] args)
    {
        // Create a queue to represent the line
        Queue<String> line = new LinkedList<>();
        
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // initialize a boolean flag to control the loop
        boolean done = false;
        
        // start a loop that continues until the user exits
        while(!done) {
            // prompt the user to enter a command
            System.out.println("Enter a command: (join, serve, exit");
            String command = scanner.nextLine();
            
            // use a switch statement to handle different commands
            switch(command) {
                case "join":
                    
                    // prompt the user to enter their name
                    System.out.println("Enter your name: ");
                    String name = scanner.nextLine();
                    
                    // add the user's name to the end of the line
                    line.add(name);
                    
                    // print a message indicationg the user has joined the line
                    System.out.println(name + " has joined the line.");
                    break;
                    
                case "serve":
                    
                    // check if the line is empty
                    if(line.isEmpty()) {
                        System.out.println("No one is in the line.");
                    }
                    else {
                        
                        // serve the next customer in the line
                        String next = line.remove();
                        
                        // print a message indicating the next customer has been served
                        System.out.println(next + " has been served.");
                    }
                    break;
                    
                case "exit":
                    
                    // print a message indicating the program is exiting
                    System.out.println("Exiting program");
                    
                    // set the done flag to true to exit the loop
                    done = true;
                    break;
                    
                default:
                    
                    // print a message indicating an invalid command was entered
                    System.out.println("Invalid command.");serve
            }
        }
    }
}
