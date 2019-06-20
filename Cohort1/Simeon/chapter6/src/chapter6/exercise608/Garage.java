package chapter6.exercise608;

import java.util.Scanner;

public class Garage {

	public static void calculateCharges() {
		
		double charges = 0;
		double minCharge = 2.0;
		double maxCharge = 10.00;
		int hours = 0;
		double total = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter number of customers: ");
		int num = input.nextInt();
	
		System.out.print("Enter number of hours: \n");	
		System.out.printf("%s\t%s%n","Hours parked","Charges");
		//System.out.print("\n");
		
		for(int i=1;i <= num; i++) {
			hours = input.nextInt();
			
			if (hours > 24 || hours < 1 ) {
				System.out.print("Not valid");
				System.out.println();
				System.out.print("Enter number of hours: ");
				;
			}
			
			if (hours > 3 && hours < 19) {
				charges = minCharge + (0.50 * (hours - 3));
				System.out.printf("\t\t%.2f%n", charges);
			}
			
			if( hours <= 3) {
				charges = minCharge;}
			else if (hours >= 19 && hours <= 24) {
				charges = maxCharge;
				System.out.printf("\t\t%.2f%n", charges);
				}
			
	
			//System.out.printf("\t\t%.2f%n", charges);
			total += charges;
		}
		System.out.println("Total charges: " + total);
		
		input.close();
	}
}
