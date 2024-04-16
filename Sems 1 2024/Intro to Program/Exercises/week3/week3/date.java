package week3;
import java.util.Scanner;

public class date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter today's date (day, date, month, year):");
        String day = scanner.next();
        int date = scanner.nextInt();
        String month = scanner.next();
        int year = scanner.nextInt();

        System.out.println("American Format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("European Format: " + day + " " + date + " " + month + " " + year);
        scanner.close();
    }
}
