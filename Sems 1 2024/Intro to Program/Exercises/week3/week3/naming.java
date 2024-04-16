package week3;
import java.util.Scanner;

public class naming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.next();
        System.out.print("Enter your last name: ");
        String lastName = scanner.next();

        String fullName = firstName + " " + lastName;
        System.out.println("Hello, my name is " + fullName);
        scanner.close();
    }
}
