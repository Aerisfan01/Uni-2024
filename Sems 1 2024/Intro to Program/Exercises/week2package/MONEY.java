package week2package;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MONEY {
    public static void main(String[] args) {
        // Store details
        String storeName = "League of Legends Item Shop (Blue Side)";
        String storeAddress = "Blue Side";
        String contactNumber = "Money";

        // Transaction details
        String transactionType = "TAX INVOICE";
        String dateTime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());

        // Item details
        String item1Name = "Profane Hydra";
        double item1Price = 3300;

        String item2Name = "Sterak's Gage";
        double item2Price = 3000;

        String item3Name = "Edge of Night";
        double item3Price = 2800;

        // Calculate total price
        double totalPrice = item1Price + item2Price + item3Price;

        // Calculate GST (10% of total price)
        double gst = 0.1 * totalPrice;

        // Calculate total price with GST
        double totalPriceWithGST = totalPrice + gst;

        // Print Invoice
        System.out.println("=======================================");
        System.out.println(storeName);
        System.out.println(storeAddress);
        System.out.println("Contact: " + contactNumber);
        System.out.println("=======================================");
        System.out.println(transactionType);
        System.out.println("Date and Time: " + dateTime);
        System.out.println("=======================================");
        System.out.println("Items Purchased:");
        System.out.println(item1Name + ": $" + item1Price);
        System.out.println(item2Name + ": $" + item2Price);
        System.out.println(item3Name + ": $" + item3Price);
        System.out.println("=======================================");
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("GST (10%): $" + gst);
        System.out.println("Total Price (with GST): $" + totalPriceWithGST);
        System.out.println("=======================================");
        System.out.println("You were served by Doran");
        System.out.println("Finally, a customer!");
    }
}