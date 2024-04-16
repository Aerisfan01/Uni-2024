package week3;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.println("Enter four numbers:");
        for (int i = 0; i < 4; i++) {
            double num = scanner.nextDouble();
            total += num;
        }

        System.out.println("The total is: " + total);
        scanner.close();
    }
}
