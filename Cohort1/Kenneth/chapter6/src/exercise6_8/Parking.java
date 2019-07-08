/**
 * 
 */
package exercise6_8;

import java.util.Scanner;

/**
 * @author ken_granero
 *
 */
public class Parking {
	
	
	
	public static double calculateCharges(int hours) {
		double charges = 0;
		if(hours <= 3 && hours > 0) {
			charges = 2.00;
		}
		if(hours > 3 && hours < 19) {
			hours = hours - 3;
			charges = (hours * 0.50) + 2.00;
		}
		if(hours >= 19 && hours<= 24) {
			charges = 10.00;
		}
		return charges;
	}
	
	public static void calculateTotal() {
		Scanner insert = new Scanner(System.in);
		
		int count = 1;
		double charges = 0;
		double total = 0;
		
		System.out.println("Enter number of customer : ");
		int numberOfCustomer = insert.nextInt();

		int hours = 0;
		
		while (count <= numberOfCustomer) {	
			
			System.out.println("Enter hours : ");
			
			hours = insert.nextInt();	
			
			charges = calculateCharges(hours);
			
			total = total + charges;
			
			System.out.println("Current customer charges :" + charges);
			
			count++;
		}
		
		System.out.println("Total charges : " + total);
		
		insert.close();
	}
	

}
