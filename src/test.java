
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class test {
    public static void main(String[] args) {
        StdOut.println("Enter a number:");
        int number = StdIn.readInt(); // Read an integer from standard input
        StdOut.println("You entered: " + number);
        
        int randomNum = StdRandom.uniformInt(1, 100); // Generate a random number between 1 and 100
        StdOut.println("Random number: " + randomNum);
    }
}
