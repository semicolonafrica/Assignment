package chapter6.exercise6_8;

import java.util.Scanner;

public class Park {

	
	public static double calculatecharges() {
		Scanner input = new Scanner(System.in);
		
		int hours = 0;
		double extraCharges;
		int counter =1;
		double minimumCharge =2.0;
		int extraHours;
		double maximumCharge =10.0;
		double total = 0;
		
		
		
		while(hours != -1) {
			 System.out.println("Enter hours spent by customer and press -1 to end");
			 hours = input.nextInt();
			 
			 if (hours >= 1 && hours <= 3) {
				 	
				System.out.println("The charges for customer" +counter+" is "+ "$" + minimumCharge);
				total+=minimumCharge;
			 }
			 else if(hours >= 3 && hours <= 19) {
			 		extraHours =  hours - 3;
			 		extraCharges = (extraHours * 0.5) + minimumCharge;
			 		System.out.println("The charges for customer" +counter+" is "+"$"+ extraCharges);
			 		total += extraCharges;
			 	}
			 else if (hours >= 19 && hours <= 24) {
			 		System.out.println("The charges for customer" +counter+" is "+ "$" + maximumCharge);
			 		total+= maximumCharge;
			 	}
			 	else {
			 		
			 		System.out.println("Wrong input! Enter hours within 24 hours ");
			 		
			 	}
			 	counter++; 	
			 	System.out.println();
			 	
		}
				System.out.println("The total charges for all the customers is: "+"$" + total);
				input.close();
				return total;
	}
}
