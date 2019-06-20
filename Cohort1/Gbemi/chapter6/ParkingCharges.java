package chapter6.exercise6_8;
import java.util.Scanner;
public class ParkingCharges {
	
	

	public static void calcCharges() {
		Scanner input = new Scanner(System.in);
		
		double extraTotal = 0;
		double charges = 0;
		double total = 0;
		double chargePerhour = 2.00; // charges for 3hrs
		double maxCharge = 10.0; // charge for 24hrs
		double extraChargePrice = 0.50; // charges for extra one hour
		double chargePerDay = 10.00; // charges for 24hrs
		
		System.out.println("enter number customer");
		int customer = input.nextInt();
		
		
		for (int l =1; l <= customer; l++) {
			
		System.out.println("enter customer hours");
		 int hours = input.nextInt();					
			
			if (hours >= 1 && hours <=3) {
				charges = chargePerhour;
				System.out.println("Charges = "+ "$"+chargePerhour);
			}
			
			else if (hours>= 19 && hours <= 24) {
				charges = maxCharge;
				System.out.println("Charges = "+ "$"+maxCharge);
			}
			else if(hours > 3 && hours <19){	
				extraTotal =extraChargePrice * (hours - 3);
				charges= extraTotal + chargePerhour;
				
				System.out.println("Charges = "+"$"+charges);
				
			}
			else if (hours <1){
				charges = 0;
				System.out.println("Error!!! Please enter hours within range.");
			}
			else {
				charges = 0;
				System.out.println("Error!!! Please enter hours within range.");
			}
			total += charges;
			}
		
		System.out.println("Total charges = " + total);
		}
	
//	}
	
	public static void main(String [] args) {
		ParkingCharges.calcCharges();
	}
}
