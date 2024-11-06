// Princeton Algorithm Assignment 1 Question 1
// receiving command-line arguments
// printing message to the terminal based on the arguments received

public class HelloGoodbye {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Enter two command-line arguments for the HelloGoodbye program");
            return;
        }
        String firstName = args[0];
        String secondname = args[1];
        System.out.println("Hello" + " " + firstName + " " + "and" + " " + secondname + ".");
        System.out.println("Goodbye" + " " + secondname + " " + "and" + " " + firstName + ".");
    }
}
