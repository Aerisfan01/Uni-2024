import java.util.Scanner;

public class BOOSTIOOOO {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the exceeding speed limit (in km/h): ");
        int speedLimitExceeded = scanner.nextInt();

        int fine = 0;
        int demeritPoints = 0;
        String suspension = "No suspension";

        if (speedLimitExceeded <= 10) {
            fine = 207; // Fine for speeding up to 10 km/h above the limit
            demeritPoints = 1;
        } else if (speedLimitExceeded <= 24) {
            fine = 322; // Fine for speeding between 11 to 24 km/h above the limit
            demeritPoints = 3;
        } else if (speedLimitExceeded <= 34) {
            fine = 484; // Fine for speeding between 25 to 34 km/h above the limit
            demeritPoints = 4;
        } else if (speedLimitExceeded <= 44) {
            fine = 937; // Fine for speeding between 35 to 44 km/h above the limit
            demeritPoints = 6;
        } else if (speedLimitExceeded <= 49) {
            fine = 1552; // Fine for speeding between 45 to 49 km/h above the limit
            demeritPoints = 8;
        } else {
            fine = 1987; // Fine for speeding 50 or more km/h above the limit
            demeritPoints = 12;
            suspension = "3 months";
        }

        System.out.println("Fine: $" + fine);
        System.out.println("Demerit Points: " + demeritPoints);
        System.out.println("License Suspension: " + suspension);

        scanner.close();
    }
}

