package chapter5.exercise5_32;

//Author: Emmanuel Akinbode

import java.util.Scanner;

public class Tax {
	
	public void calTax() {
		String items = "";
		double price = 0;
		int counter = 1;
		double total = 0;
		double tax = 0;
		String space = " ";
		
		Scanner input = new Scanner(System.in);
		//System.out.println("Items\tPrice\t");
		
		while(price != -1) {
			
			total+=tax;
			space = input.nextLine();
			
			//System.out.println("Enter items: ");
			items = input.nextLine();
			
			//System.out.println("Enter price: ");
			price = input.nextDouble();
						
			tax= price * 0.23;	
			System.out.println(items+"\t" + price+"\t");
			counter++;
		}
		
			
			System.out.println("Tax is: " + total);
	
			
	}

}
