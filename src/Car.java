//OOP in java programming
class CarClass {
    // Properties (instance variables)
    private String model;
    private String color;
    private int number;

    // Constructor
    public CarClass(String model, String color, int number) {
        this.model = model;
        this.color = color;
        this.number = number;
    }

    // Method to print message about the car
    public void message() {
        System.out.println("This is a " + color + " " + model + ". There are " + number + " of them.");
    }
}

// Using the CarClass
public class Car {
    public static void main(String[] args) {
        CarClass myCar = new CarClass("Toyota", "Red", 20);
        myCar.message();  // Calls the message method with no arguments
    }
}
