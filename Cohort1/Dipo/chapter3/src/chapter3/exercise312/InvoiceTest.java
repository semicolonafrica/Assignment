package chapter3.exercise312;

//program for Invoivetest.java//

//java.util.Scanner //
import java.util.Scanner;


//creating a class.java for the test //
public class InvoiceTest{


 // creating a main class for the program //
 public static void main(String[] args) {

     // calling the Scanner //
     Scanner input = new Scanner(System.in);

     Invoice newInvoice = new Invoice("34ES342  ", "straight " , 1250, 2.345);
	
     System.out.printf("Initial Part Number is:  %s%n",  newInvoice.getPartNumber());

     System.out.println("Enter Part Number: ");
     String partNumber = input.nextLine();
     newInvoice.setPartNumber(partNumber);

     System.out.printf("Number in object getPartNumber is: %s%n", newInvoice.getPartNumber());

     System.out.println("Enter part description: ");
     String partDescription = input.nextLine();
     newInvoice.setPartDescription(partDescription);

     System.out.println("Enter Quantity: ");
     int ItemQuantity = input.nextInt();
     newInvoice.setItemQuantity(ItemQuantity);

     System.out.println("Enter Price Per Item: ");
     double pricePerItem = input.nextDouble();
     newInvoice.setPricePerItem(pricePerItem);

 }
}
