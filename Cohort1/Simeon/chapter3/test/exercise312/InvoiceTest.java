package exercise312;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice customer1 = new Invoice("234hers", "Engine boris", 5, 23.99);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("PartNumber\tPartDescription\tQuantity\tPrice");
		System.out.printf("%s\t%20s\t%d\t%13.2f", customer1.getPartNumber(),
				customer1.getPartDescription(), customer1.getItemQuantity(),
				customer1.getItemPrice());
		System.out.println();
		System.out.printf("Total Amount is: %.2f", customer1.getInvoiceAmount());
		
		System.out.println();
		
		System.out.print("Enter partNumber: ");
		String partNumber = input.nextLine();
		customer1.setPartNumber(partNumber);
		
		System.out.println();
		
		System.out.print("Enter partDescription: ");
		String partDescription  = input.nextLine();
		customer1.setPartDescription(partDescription);
		
		System.out.println();
		
		System.out.print("Enter Quantity of item: ");
		int quantity = input.nextInt();
		customer1.setItemQuantity(quantity);
		
		System.out.println();
		
		System.out.print("Enter Price of Item: ");
		double price = input.nextDouble();
		customer1.setItemPrice(price);
		
		System.out.println();
		
		System.out.println("PartNumber\tPartDescription\tQuantity\tPrice");
		System.out.printf("%s\t%20s\t%d\t%13.2f", customer1.getPartNumber(),
				customer1.getPartDescription(), customer1.getItemQuantity(),
				customer1.getItemPrice());
		System.out.println();
		System.out.printf("Total Amount is: %.2f", customer1.getInvoiceAmount());
		
		input.close();
	}

}
