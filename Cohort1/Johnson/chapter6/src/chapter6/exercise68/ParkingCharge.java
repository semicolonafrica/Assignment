package chapter6.exercise68;

import java.util.Scanner;
public class ParkingCharge {

	public static void main(String[] args) {
		multipleCharge();
	}
	public static double calculateCharges() {
		double charges =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of hours spent: ");
		int hours = input.nextInt();
		if (hours <= 3) {
			charges = 2;
		}
		if (hours > 3 && hours <=19) {
			charges = 2 + (0.5 * (hours - 3));	
		}
		if(hours > 19 && hours <= 24) {
			charges = 10;	
		}
		System.out.println("charges for this customer is: $"+ charges);
		return charges;
	}
	public static void multipleCharge() {
		double totalCharges = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter number of custumers");
		int numOfCustomer = input.nextInt();
		for(int i = 1; i<=numOfCustomer; i++) {
			System.out.println("enter for customer"+i);
			totalCharges = totalCharges + calculateCharges();
		}
		System.out.println("total charges for all customers so far: $"+totalCharges);
	}

}
