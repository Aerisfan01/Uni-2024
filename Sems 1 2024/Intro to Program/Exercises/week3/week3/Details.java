

import java.util.Scanner;

public class Details {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        int[] ages = new int[5];

        System.out.println("Enter names and ages of five students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name: ");
            names[i] = scanner.next();
            System.out.print("Enter age: ");
            ages[i] = scanner.nextInt();
        }

        System.out.println("Student Details:");
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + " - " + ages[i]);
        }
        scanner.close();
    }
}
