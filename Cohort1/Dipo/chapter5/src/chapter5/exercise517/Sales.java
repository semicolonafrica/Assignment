package chapter5.exercise517;
import java.util.Scanner;
public class Sales {

	public double calculateRetail() {
		double product1, product2, product3, product4, product5;
		double totalRetail = 0.0;
		int productNumber;
		int quantitySold;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1-product1,$2.98");
			System.out.println("2-product1,$4.50");
			System.out.println("3-product1,$9.98");
			System.out.println("4-product1,$4.49");
			System.out.println("5-product1,$6.87");
			System.out.println("6-Exit program");
			
			//Enter product number
			System.out.println("Enter product number: ");
			int prodNumber = input.nextInt();
			
			//exiting program
			if(prodNumber == 6) {
				break;
			}
			
			//Enter quantity sold
			System.out.println("Enter quantity sold: ");
			int quantSold = input.nextInt();
			
			//Using Switch statement for retail price for each product
			switch(prodNumber) {
				
				case 1:
					totalRetail += 2.98 * quantSold;
					break;
				case 2:
					totalRetail += 4.50 * quantSold;
					break;
				case 3:
					totalRetail += 9.98 * quantSold;
					break;
				case 4:
					totalRetail += 4.49 * quantSold;
					break;
				case 5:
					totalRetail += 6.87 * quantSold;
					break;
			}
			System.out.println("\n Total RetailValue:$"+totalRetail);
		}
		
		
		return totalRetail;
	}
	
	

}
