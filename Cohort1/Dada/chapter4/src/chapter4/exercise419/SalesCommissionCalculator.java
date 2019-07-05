package chapter4.exercise419;

import java.util.Scanner;
public class SalesCommissionCalculator {
	double product1 = 239.99;
	double product2 = 129.75;
	double product3 = 99.95;
	double product4 = 350.89;
	
//	double percentageCommission = 0.09;
//	double salesCommission = 200;
	
	public double calculateCommission() {
		Scanner input = new Scanner(System.in);
		double percentageCommission = 0.09;
		double salesCommission = 200;
		
		double quantity = 0;
		int item = 0;
		double productSold = 0;
		double salesEarnings = 0;
		
		System.out.println("Enter the number of item sold or -1 to quit: ");
		item = input.nextInt();
		
		while(item != -1) {
			System.out.println("Enter quantity sold: ");
			quantity = input.nextInt();
			
			if(item == 1) {
				productSold = productSold + product1 * quantity;
			}
			if(item == 2) {
				productSold = productSold + product2 * quantity;
			}
			if(item == 3) {
				productSold = productSold + product3 * quantity;
			}
			if(item == 4) {
				productSold = productSold + product4 * quantity;
			}
			System.out.println("Enter the number of item sold or -1 to quit: ");
			item = input.nextInt();
		}
		salesEarnings = productSold * percentageCommission + salesCommission;
		return salesEarnings;
	}
	
	

}
