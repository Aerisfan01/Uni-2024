public class Rectangle {
    private double length;
    private double width; 

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width; //using this.length/width to define the measurements to be allowed to be inputted 
    }

    public double calculateArea() { // Calculates the Area and will assign it to calculateArea
        return length * width;
    }

    public double calculatePerimeter() {  // calculates perimeter and assigns it to calculatePerimeter
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(88, 99); //sets the length and width of rectangle

        double area = rectangle.calculateArea(); //calls the area calculation and gives it a name so it can be outputted
        double perimeter = rectangle.calculatePerimeter(); //calls the Perimeter calculation and gives it a name so it can be outputted

        System.out.println("Area of the Rectangle: " + area);
        System.out.println("Perimeter of the Rectangle: " + perimeter); //prints the measurement 
    }
}