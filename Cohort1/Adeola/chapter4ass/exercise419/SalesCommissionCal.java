package exercise419;

import java.util.Scanner;

public class SalesCommissionCal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double totalWage = 200;
		int soldItemCounter = 0;
		double amountPerItem = 0;
		
		while (amountPerItem != -1) {
			System.out.print("Enter price of item sold or -1 to quit : ");
			amountPerItem = input.nextDouble();
			totalWage += (0.09 * amountPerItem);
			soldItemCounter += 1;
		}
		
		System.out.printf("the total for this Sales person is %f%n the commision from the %d items sold has been added ", totalWage, soldItemCounter);
	}
}
