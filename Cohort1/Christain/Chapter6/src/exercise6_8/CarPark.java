package exercise6_8;
import java.util.Scanner;
public class CarPark {
		
	public static double calculateCharges(int numberOfHours) {
		int extraHours = numberOfHours - 3;
		double extraCharges = extraHours * 0.50;
		double charges = 0;
		
		//charges for yesterday
		if(numberOfHours == 24)
			charges = 10.0;
		if(numberOfHours == 3)
			charges = 2.0;
		//charges 
		if(numberOfHours > 3 && numberOfHours < 24)
			extraHours = (int) (extraCharges + 2);
		else {
			System.out.print("No charges");
		}
		return numberOfHours;
	}
	
	//input 
	public static int calculateReceipt() {
		
		int totalCharges = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of customers: ");
		int customer = input.nextInt();
		
		for(int i = 1; i <= customer; i++) {
			System.out.println("Enter number of Hours Parked: ");
			int numberOfHours = input.nextInt();
			
			totalCharges += numberOfHours * customer;
			System.out.println("Total charges for yesterday" + totalCharges);
		}
		return totalCharges;
	}
}
