import java.util.Scanner;


public class robloxdoors {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in); //scan for the numbers

        System.out.print("What is the first code for the security?");   //Used to ask for the codes from the resident 
        int code1 = scanner.nextInt();

        System.out.print("what is the second code for the security");
        int code2 = scanner.nextInt();
        

       // int codeS1 = code1 + code2;   used for intial tests (didnt work at all)



      //  if (codeS1 = 150){
      //      System.out.println("Door is Opening");
       // } else if (codeS1 <150) {
       //     System.out.println("Door Closed for three minutes, then try again");


       if (code1 >=55 & code2 >= 75){   // if code1 is 55 and code2 is 75 it'will open the door but if one of the other numbers are wrong it'll close the door and further more if the code is still wrong the dorr will be sealed
           System.out.println("Door is Opening");
       } else if (code1 >= 55 && code2 <= 75) {
           System.out.println("Door Closed for three minutes, then try again");
            
        } else {
            System.err.println("Door Sealed, Security has been called");
        }



            
        }


    }

