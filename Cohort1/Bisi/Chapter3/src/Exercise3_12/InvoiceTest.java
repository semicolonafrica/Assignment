package Exercise3_12;
import java.util.Scanner;

import Exercise3_11.Account;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice details = new Invoice(0, 0, "H12"," Shock-Absorber");
		
		Scanner in = new Scanner(System.in);		
		
		System.out.print("Enter value for Quantity of Item: ");
		int quantityPurchased = in.nextInt();
		details.setQuantityPurchased(quantityPurchased);
		
		System.out.print("Enter Price of Item: ");
		int pricePerItem = in.nextInt();
		details.setPricePerItem(pricePerItem);
		
		System.out.println();
		
		System.out.println("Amount of Item purchased is $"+ details.getInvoiceAmount(0));
	}

}
