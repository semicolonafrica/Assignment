package exercise68;
import java.util.Scanner;

public class ParkingCharges {
	static Scanner input = new Scanner(System.in);
	static double totalCharges = 0;
	public static double calculateCharges() {
		
		System.out.println("enter number of hours spent");
		int hours= input.nextInt();
		double charges = 2;
		//charges when the number of hours is more than 3
		if(hours>3) {
			charges=2 + (0.5*(hours-3));
		}
		// when charges is greater than $10 
		if(charges > 10) {
			charges = 10;
		}
		System.out.println("charges for this customer is:"+ charges);
		return charges;
	}
	public static void multipleCharges() {
		System.out.println("enter number of custumers");
		int numOfCustomer = input.nextInt();
		
		for(int i = 1; i<=numOfCustomer; i++) {
			System.out.println("enter for customer"+i);
//			calculateCharges();
			totalCharges = totalCharges + calculateCharges();
		}
		
		System.out.println("total charges for all customers so far: "+totalCharges);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		multipleCharges();

	}

}
