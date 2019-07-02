/**
 * 
 */
package chapter6.exercise6_8;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class ParkingCharges {
	
	public void calculateCharges() {
		
		double fixCharges = 0;
		double totalCharge = 0;
		double extraHoursCharge = 0;
		int fixedHour = 3;
		int hours = 0;
		int extraHours;
		double dayCharge = 0;
		String date = "";
		String customer = " ";
		String space = "";
		int counter = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter customer name, "
				+ "\n date in format month/day/year "
				+ "\n and prking hours");
		
		while(customer != "nil") {
			space = input.nextLine();
			
			customer = input.nextLine();
			date = input.nextLine();
			hours = input.nextInt();
					
			counter++;
			
			
		}
		if(customer == "nil") {
			if(hours > 3) {
				
				extraHoursCharge = (double)(hours - fixedHour) * 0.05;
				extraHoursCharge+=2;
			}
			if(hours == 24) {
				dayCharge = hours * 24;
			}
			if(hours <= 3) {
				fixCharges = hours * 2;
			}
			totalCharge = extraHoursCharge + dayCharge + fixCharges;
			System.out.println("Total charge is: " + totalCharge);
		}
		
	}
	

}
