package chapter7;

import java.util.Scanner;

public class AirlineReservationSystem {

	public static Scanner input = new Scanner(System.in);
	// One dimensional-array 
	
	public static void isSeatingChart() {
		
		
		boolean[] value = new boolean[11];
		
		
		//System.out.print("Enter the flight type\nType 1 for First Class\n Type 2 for Economy");
		int type = 0;
		
	
			
			for(int i = 1; i < value.length; i++) {
				System.out.print("\nEnter the flight type\nType 1 for First Class\n Type 2 for Economy\n");
				type = input.nextInt();
				if(type == 1) {
					if(i >= 1 && i < 6) {
						
						//value[i] = true;
						System.out.printf("%n%s%d%n%s%n","Seat Number: ", i,"First Class");
						//break;
				
					}
				}
					else if(type == 2){
						if(i >= 6 && i <= 10) {
						
						//value[i] = true;
						
						System.out.printf("%n%s%d%n%s%n","Seat Number: ", i,"Economy");
						//System.out.printf("", args);
						//break;
						}
					}
			
		}
		
		

		
		
	}
	
	
	
		public static void main(String[] args) {
		isSeatingChart();
	}
}
