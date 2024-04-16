import java.util.Scanner;

public class badmas {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number:"); //used to scan for the numbers in the solution
        int num1 = scanner.nextInt();

        System.out.print("Enter Second Number:");
        int num2 = scanner.nextInt();

        
        System.out.print("Enter Third Number:");
        int num3 = scanner.nextInt();

        
        System.out.print("Enter Fourth Number:");
        int num4 = scanner.nextInt();


        int sum1 = num1+num2; // addition 
        int sum2 = sum1 - num3; // subtraction
        int num5 = sum2 * num4; // multiplication 

        System.out.println("The total sum of the numbers using bodmas is "+ num5); //final output with the numbers


    }
        




    
}
