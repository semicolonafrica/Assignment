package exercise5_17;

import java.util.Scanner;

public class Sales {
	
	double product1 = 2.98;
	double product2 = 4.50;
	double product3 = 9.98;
	double product4 = 4.49;
	double product5 = 6.87;
	
	public void calculateValue() {
		Scanner insert = new Scanner(System.in);
		
		System.out.print("Enter product number:");
		int product_number = insert.nextInt();
		
		int quantity;
		double total =1;
		
		
		double item1 = 0, item2 = 0, item3 = 0, item4 = 0, item5 = 0;
		
		while(product_number != -1) {
			System.out.println("Enter quantity");
			quantity = insert.nextInt();
			
			switch(product_number) {
			case 1:
			 item1 = product1 * quantity + item1;
			 break;
			case 2:
				item2 = product2 * quantity + item2;
				break;
			case 3:
				item3 = product3 * quantity + item3;
				break;
			case 4:
				item4 = product4 * quantity + item4;
				break;
			case 5:
				item5 = product5 * quantity + item5;
			default:
				break;
				
				
			}
			System.out.print("Enter product number or -1 to end:");
			product_number = insert.nextInt();
			
			total = item1 + item2+ item3 + item4 + item5;
		}
		
		System.out.printf("The retail value is $%.2f",total);
		
		insert.close();
	}

}
