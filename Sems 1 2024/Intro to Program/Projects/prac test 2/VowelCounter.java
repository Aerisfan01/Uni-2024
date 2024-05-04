import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the countVowels method with the user input as argument
        int vowelCount = countVowels(input);

        // Print the count of vowels in the string
        System.out.println("Number of vowels in the string: " + vowelCount);

        scanner.close();
    }

    // Method to count vowels in a string
    public static int countVowels(String input) {
        int count = 0;
        // Convert the input string to lowercase to handle both uppercase and lowercase vowels
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
