import java.util.Scanner;

public class bignumba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value1: ");
        int value1 = scanner.nextInt();

        System.out.print("Enter value2: ");
        int value2 = scanner.nextInt();

        if (value1 > value2) {
            System.out.println("Greater value: " + value1);
        } else if (value2 > value1) {
            System.out.println("Greater value: " + value2);
        } else {
            System.out.println("Both values are equal: " + value1);
        }

        scanner.close();
    }
}