import java.util.Scanner;

public class TimeP3P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit of interval: ");
        int lowerLimit = scanner.nextInt();
        System.out.print("Enter the upper limit of interval: ");
        int upperLimit = scanner.nextInt();
        System.out.print("Enter the value to check: ");
        int value = scanner.nextInt();

        if (value > lowerLimit && value < upperLimit) {
            System.out.println("The value " + value + " lies within the interval (" + lowerLimit + ", " + upperLimit + ")");
        } else {
            System.out.println("The value " + value + " lies outside the interval (" + lowerLimit + ", " + upperLimit + ")");
        }

        scanner.close();
    }
}
