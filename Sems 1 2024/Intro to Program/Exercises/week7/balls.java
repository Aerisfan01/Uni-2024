import java.util.Scanner;

public class balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];

        // Get 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Display the 5 numbers in a single output line without decimal points
        System.out.print("The 5 numbers are: ");
        for (double num : numbers) {
            int roundedNum = (int) Math.round(num);
            System.out.print(roundedNum + " ");
        }
        System.out.println();

        scanner.close();
    }
}