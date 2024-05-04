public class Car {
    // Instance variables
    private String make;
    private String model;
    private int year;

    // Default constructor
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Constructor with specified values
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Create objects of Car class with default values
        Car car1 = new Car();
        Car car2 = new Car();

        // Create objects of Car class with specified values
        Car car3 = new Car("Toyota", "Camry", 2020);
        Car car4 = new Car("Honda", "Accord", 2018);

        // Print the details of cars
        System.out.println("Car 1 Details:");
        car1.displayDetails();
        System.out.println();

        System.out.println("Car 2 Details:");
        car2.displayDetails();
        System.out.println();

        System.out.println("Car 3 Details:");
        car3.displayDetails();
        System.out.println();

        System.out.println("Car 4 Details:");
        car4.displayDetails();
    }
}
