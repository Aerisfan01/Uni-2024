import java.util.Scanner;

public class SPECIALZZZ {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Temperature in celsius:"); // asks for the temperature in celsius allowing for it to be converted
        int temp = scanner.nextInt();

        double frieren = (temp*(1.8))+32;  //used frieren as name of character and starts with F for fahrenheit

        System.out.println("The Temperature in Fahrenhiet equals " + frieren); // prints output


    }
    
}
