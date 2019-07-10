package exercise6_8;
import java.util.Scanner;

public class ParkingCharges {
	private int hour;	
	private double charges;
	private int totalHours;
	private double totalCharge;
	//private String name;
	
	public void calculateCharges() {
	
	Scanner input = new Scanner(System.in);
	
	int count = 0;
	int hoursParked;	double amountCharged;
	while(hour != -1) {
		System.out.print("Enter hours parked:");
		hour = input.nextInt();		
	
		while(hour != 0) {
			break;
		}
		count++;
		
		if(hour <= 3) {
			charges = 2.00;
		System.out.println("$"+charges);
		}
		if(hour > 3 && hour < 24) {
		double extraCharge = 0.50;
		int extraHour = hour - 3;
		charges = 2.00 + (extraHour * extraCharge);
		System.out.println("$"+charges);
		}
		if(hour == 24) {
			System.out.println("$10.00");
		}
		
		totalHours = totalHours + hour;
		totalCharge = totalCharge + charges;
		//System.out.println("Hoursparked \tAmountCharged");					
		
		System.out.println("Your bill is:"+totalHours+"\n"+"$"+totalCharge);	
		}
		
	}
}	