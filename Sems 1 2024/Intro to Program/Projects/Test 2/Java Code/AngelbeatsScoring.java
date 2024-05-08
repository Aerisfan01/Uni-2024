public class AngelbeatsScoring {
    public static void main(String[] args) {
        int[] studentMarks = {48, 15, 72, 87, 99}; // the array

        double averageMarks = calculateAverageMarks(studentMarks);

        System.out.println("Average Marks of Students: " + averageMarks); //Prints the output which is the average
    }

    public static double calculateAverageMarks(int[] marks) { // defines calculateAverageMarks to be used for the print function
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double score = (double) sum / marks.length; // calcuates the sum of all the array
        return score;
    }
}