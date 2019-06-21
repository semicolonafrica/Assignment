package chapter4.exercise4_20;

import java.util.Scanner;

public class SalaryCalculator {
	
	public int calculateSalary() {
		
		Scanner input = new Scanner(System.in);
		
		int numberOfItems;
		int priceOfItems;
		int fixedsalary = 200;
		int total = 0 ;
		System.out.print("enter number of items");
		numberOfItems = input.nextInt();
		
		int counter = 0;
		
		while( counter < numberOfItems) {
			System.out.print("enter price of item");
			priceOfItems = input.nextInt();
			total = total + priceOfItems; 
			counter++;	
		}
		
		input.close();
		total = (int) (total * 0.09);
		total = total + fixedsalary;
		return total;
		
	
	}
}


