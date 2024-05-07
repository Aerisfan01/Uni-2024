import java.util.ArrayList;
import java.util.Scanner;

public class ballsv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        // Get 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextDouble());
        }

        // Display the 5 numbers in a single output line without decimal points
        System.out.print("The 5 numbers are: ");
        for (Double num : numbers) {
            int roundedNum = (int) Math.round(num);
            System.out.print(roundedNum + " ");
        }
        System.out.println();

        scanner.close();
    }
}