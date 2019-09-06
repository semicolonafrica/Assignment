package exercise419;

import java.util.Scanner;

public class SalesCommissionTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		SalesCommission sc = new SalesCommission();
		
		
		int item = 0;
		
			
		while (item != 9) {
			System.out.print("Enter each item sold[1-4] ('9' to exit): ");
			item = input.nextInt();
			sc.itemSold(item);
		
		}
		
		System.out.print("\nWEEKLY COMMISSION\n9"); //+sc.getSalesPerson());
		System.out.print("\n----------------------------\n");
		System.out.printf("Weekly sales total: $%.2f\n", sc.getGrossSales());
		System.out.printf("Weekly earnings:    $%.2f\n", sc.totalWages());
		System.out.print("\n----------------------------");
			
	    System.out.println();

	    input.close();
	}

}
