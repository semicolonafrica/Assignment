package chapter6_exercises;

import java.util.Scanner;
//Exercise 6.8
//Program to calculate the charges in a car park
//Written by Oloko Yinka and Oyemade Temitope
//18th of June 2019
	public class ParkingCharges {
		
	static final double minimumCharge = 2.00;
	static double totalChargeForYesterday = 0;
	static int defaultHours = 3;
	static Scanner input = new Scanner(System.in);
	
	public static void calculateCharges() {
		
		int hoursUsedYesterday = 1;
		int newHours;
		int counter = 1;
		double timeIn =0;
		double timeOut = 0;
		double totalHoursForToday;
		double totalChargeForToday =0;
		double overallCharges = 0;
		
		
	
			while(hoursUsedYesterday !=0) {
				
		System.out.printf("Enter hours used yesterday for customer %d or 0 to end%n", counter);
		 hoursUsedYesterday = input.nextInt();
		 
		 if(hoursUsedYesterday <1 || hoursUsedYesterday >24)
			 break;
		
		if(hoursUsedYesterday <= 3)
			 totalChargeForYesterday = minimumCharge;
		
		if(hoursUsedYesterday > 3 && hoursUsedYesterday < 24) {
			newHours = hoursUsedYesterday - defaultHours;
			totalChargeForYesterday = minimumCharge + 0.42 * newHours;
		}
		
		if(hoursUsedYesterday == 24)
			totalChargeForYesterday = 10;
		
		System.out.printf("%s%d%n", "Enter time-in in G.M.T for Customer  " ,counter);
		 timeIn = input.nextDouble();
		
			System.out.printf("%s%d%n","Enter time-out in G.M.T for Customer ", counter);
			 timeOut = input.nextDouble();
			 
			 totalHoursForToday = timeOut - timeIn;
			 
				if(totalHoursForToday <=3)
					totalChargeForToday = minimumCharge;
				
				
				if(totalHoursForToday > 3 && totalHoursForToday <24)
					totalHoursForToday = totalHoursForToday - defaultHours;
				totalChargeForToday = minimumCharge + 0.42 * totalHoursForToday;
				
				
				if(totalHoursForToday == 24)
					totalChargeForToday = 10;
				
			
		
		overallCharges = totalChargeForYesterday + totalChargeForToday;
		
		
		System.out.printf("%s%d%s$%.2f%n","Parking charges for customer ", 
				counter, " yesterday is ", totalChargeForYesterday);
		
		System.out.printf("%s%d%s$%.2f%n", "Parking charges for customer ",
				counter, " today is ", totalChargeForToday);
		System.out.printf("%s%d%s$%.2f%n", "Total parking charges for customer ", 
				counter, " is ", overallCharges);
		
		counter ++;
			}
		
		
		
	
	}
				
		

}
