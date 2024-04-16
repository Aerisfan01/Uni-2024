import java.util.Scanner;

public class EGGGAMING {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the average egg weight (in grams): ");
        double weight = scanner.nextDouble();

        if (weight > 72) {
            System.out.println("Size: King-Size");
        } else if (weight >= 68 && weight <= 72) {
            System.out.println("Size: Jumbo");
        } else if (weight >= 60 && weight <= 67) {
            System.out.println("Size: Extra-Large");
        } else if (weight >= 52 && weight <= 59) {
            System.out.println("Size: Large");
        } else if (weight >= 43 && weight <= 51) {
            System.out.println("Size: Medium");
        } else {
            System.out.println("Size: Too Small");
        }

        scanner.close();
    }
}