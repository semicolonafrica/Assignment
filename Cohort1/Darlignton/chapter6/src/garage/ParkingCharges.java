package garage;

import java.util.Scanner;

public class ParkingCharges {
	private double charge = 2.0;
	private int extraHour;
	private double extraCharge = 0.50;
	private double maximumCharge = 10.0;
	private double totalCharge;
	private  double receipt = 0.0;
	
	public void calculateCharge(int hoursParked) {
		Scanner input = new Scanner(System.in);
	
		extraHour = hoursParked - 3;
		if(hoursParked < 1) {
			System.out.println("Input a valid amount");
			hoursParked = input.nextInt();
		}
		else if(hoursParked <= 3) {
			totalCharge = charge;
		}
		else if(hoursParked > 3 && hoursParked < 19) {
			totalCharge = charge + (extraCharge * extraHour);
		}
		else if(hoursParked > 24) {
			System.out.print("Enter a valid number");
			hoursParked = input.nextInt();
		}
		else {
			totalCharge = maximumCharge;
		}
		System.out.println(totalCharge);
		receipt = receipt + totalCharge;
		//return totalCharge;
		System.out.println(receipt);

	}
	
}