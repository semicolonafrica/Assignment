package exercise6_8;

// @author Chukwuebuka & Olabisi
import java.util.Scanner;

public class ParkingCharges {
	
	 private int hour =0;
	 private double fixCharge;
	 private double hoursParked;
	 
	 Scanner input = new Scanner(System.in);
	 
	public void calculateCharges() {
		 
		//  int count =0;
		  while(hour != 0) {
			  System.out.print("Enter Hours Parked:" );
			  hour = input.nextInt();
			  if(hour == 0) {
				  break;
			  }
	      // count++;
		 if(hour <= 3) {
			 System.out.println("$2.00");
		 }
		 if(hour > 3 && hour < 24) {
			double extraCharge = 0.50;
			int  extraHour = hour -3;
			 hoursParked = 2.00 + (extraHour * extraCharge);
			 System.out.println("$" + hoursParked);
		 }
		 if(hour == 24){
		 System.out.println("$"+10.00);
		 }
		  }
	}
	
}
		