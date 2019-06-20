package exercise5_17;

import java.util.Scanner;

public class Sales {
	private int productNo;
	private double price;

		 public void calSum() {
		 double total = 0; int quantitySold = 0;
		 price = productNo * quantitySold;
		 
		 Scanner input = new Scanner(System.in);
					
			while(quantitySold != -1) {	
				quantitySold++;
				
			System.out.print("Enter Product number btw 1-5 or -1: ");
				int productNo = input.nextInt();

			System.out.print("Enter quantity sold or -1: ");
			 quantitySold = input.nextInt();
						
		 switch (productNo) {
			case 1: price = 2.98 * quantitySold;
			break;
			case 2: price = 4.50 * quantitySold;
			break;
			case 3: price = 9.98 * quantitySold;
			break;
			case 4: price = 4.49 * quantitySold;
			break;
			case 5: price = 6.87 * quantitySold;
			break;
			default: price = 0.0;
			break;
			}	
		 if(quantitySold != -1) {
				
			 System.out.println("the price is:$"+ price);
			 System.out.println();
			  }
	 	
			total+= price;		 	
		 	System.out.println("Product sold in total is:$"+ total);
		 	System.out.println();
			}
	 }
 }
 


