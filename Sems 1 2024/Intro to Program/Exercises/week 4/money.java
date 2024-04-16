import java.util.Scanner;

public class money {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter representative's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter weekly sales amount: ");
        double sales = scanner.nextDouble();

        double salary = 200; // Base salary
        double commission = 0.05 * (sales - 200); // Commission for sales exceeding $200
        if (sales > 2000) {
            salary += 50; // Bonus for sales exceeding $2000
        }
        salary += commission;

        System.out.println("Representative Name: " + name);
        System.out.println("Weekly Salary: $" + salary);

        scanner.close();
    }
}

