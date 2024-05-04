import java.util.Arrays;
import java.util.Random;

public class SecondLargestElement {
    public static void main(String[] args) {
        // Generate an array of random integers
        int[] array = generateRandomArray(10); // Change 10 to specify the array size

        // Find and print the second largest element
        findAndPrintSecondLargest(array);
    }

    // Method to generate an array of random integers
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Generating random integers between 0 and 99
        }
        return array;
    }

    // Method to find and print the second largest element
    public static void findAndPrintSecondLargest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array contains less than two elements.");
            return;
        }
        Arrays.sort(array);
        int secondLargest = array[array.length - 2];
        System.out.println("Second largest element: " + secondLargest);
    }
}
