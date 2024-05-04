public class Employee {
    // Instance variables
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Create objects of Employee class
        Employee employee1 = new Employee("John", 30, 50000.0);
        Employee employee2 = new Employee("Alice", 25, 60000.0);

        // Call displayDetails method to display employee details
        System.out.println("Employee 1 Details:");
        employee1.displayDetails();
        System.out.println();

        System.out.println("Employee 2 Details:");
        employee2.displayDetails();
    }
}
