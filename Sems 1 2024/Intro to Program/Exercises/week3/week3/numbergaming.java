package week3;
import java.util.Random;
import java.util.Scanner;

public class numbergaming {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the number (between 1 and 100): ");
        int guess = scanner.nextInt();

        System.out.println("The difference between your guess and the number is: " + Math.abs(guess - number));
        scanner.close();
    }
}