package chapter6.exercise608;
import java.util.Scanner;
public class ParkingCharges {
	
	
	//public int getHours() {
		//return hours;
	//}

	//public void setHours(int hours) {
		//this.hours = hours;
	//}
	
	public static double calculateCharges(int hours) {
		 
		double charge = 2.0;
		
		
		//public double calculateCharges() 
			
			if(hours <= 3) {
				charge = charge;
			}
			else 
				if(hours > 3 && hours < 19) { 
					charge += (0.5 * (hours - 3)); 
					}
			else  
				if(hours >= 19 && hours <= 24) {
						charge = 10.00;
			}
			
			
		
		return charge;
			
	}
	
	public static double calculateTotalChargee() {
		
		double totalCharge = 0;
		int  numberOfCars = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of cars: ");
		numberOfCars = input.nextInt();
		
		for(int counter = 1; counter <= numberOfCars; counter++ ) {
			
			System.out.printf("Enter the number of hours for car  : %d%n", counter);
			int time = input.nextInt();
			System.out.printf("Charge for current customer is: $%.2f%n",calculateCharges(time));
			totalCharge += calculateCharges(time);
			
			
		}
		
		
		return totalCharge;
		
	}
	
	

	public static void main(String[] args) {
					
			System.out.printf("the running total of yesterday is: $%.2f", calculateTotalChargee());
			
		

	}
				
			
			//return charge;
			
			
		//}
		
	}


