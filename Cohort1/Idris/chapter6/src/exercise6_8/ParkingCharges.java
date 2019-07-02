package exercise6_8;

import java.util.Scanner;
public class ParkingCharges {

	public static double calculateCharges() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of Customer: ");
		double a = input.nextDouble();
		double b = 0.0;
		//double extraTime = 0.0;
		double currentCharges = 0.0;
		double totalCharges = 0.0;
		double i;
		if(a < 0) {
			System.out.println("Invalid input please enter from 1 upward");
		}
		
			for(i = 1; i<= a; i++) {
				System.out.println("How long this your car stayed in the garage: ");
				b = input.nextDouble();
				
				if(b >= 1.0  && b <= 3.0){
					currentCharges = 2.00;	
					}
				if((b>3.0) && (b <= 19.0)) {
					
					currentCharges=((b - 3.0)*0.5)+2.00;
					
				}
			
			else if((b>19)) {
				currentCharges = 10.00;
			}

				totalCharges += currentCharges;
		  }
		input.close();
	
		return totalCharges;	
  }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.println(calculateCharges());
		input.close();
	}
	
}