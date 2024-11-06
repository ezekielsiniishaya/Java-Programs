/* Princeton Algorithm Assignment 1 question 2. A program that receives strings from standard input and prints any word at random based on Knuth’s method */

// Importing classes from algs4.jar
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = ""; // Variable to store the champion word
        int i = 0; // Counter for the number of words read

        // Receiving strings from standard input but marked out to meet assignment
        // requirements
        // StdOut.println("Enter Strings to print any string at random (end input with
        // Ctrl+D or Ctrl+Z then enter): ");

        // Read until there are no more strings available
        while (!StdIn.isEmpty()) {
            String currentWord = StdIn.readString(); // Read the next word
            i++;

            // Use Bernoulli method to select the current word with probability 1/i
            boolean r = StdRandom.bernoulli(1.0 / i);
            if (r) {
                champion = currentWord; // Update champion if selected
            }
        }
        // check for no input
        if (i == 0) {
            StdOut.println("No words were entered.");
        } else {
            StdOut.println(champion);// Output the final champion word
        }

    }
}
