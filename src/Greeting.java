//A program to a class and its method within the main class
public class Greeting {
    public static void main(String[] args) {
        Print print = new Print();
        print.printMessage();
    }
    
}

class Print {
    public void printMessage() {
        System.out.println("Greeting!");
    }
}