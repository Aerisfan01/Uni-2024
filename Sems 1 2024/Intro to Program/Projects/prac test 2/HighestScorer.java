import java.util.Scanner;

public class HighestScorer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        // Arrays to store student names and scores
        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];

        // Prompt the user to enter the names and scores of each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter the score of student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
        }

        // Find the student with the highest score
        int highestScoreIndex = 0;
        for (int i = 1; i < numStudents; i++) {
            if (scores[i] > scores[highestScoreIndex]) {
                highestScoreIndex = i;
            }
        }

        // Print the name of the student with the highest score
        System.out.println("Student with the highest score: " + names[highestScoreIndex]);

        scanner.close();
    }
}
