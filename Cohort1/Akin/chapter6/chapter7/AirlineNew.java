package chapter7;

import java.util.Scanner;

public class AirlineNew {
	
	public static Scanner input = new Scanner(System.in);
	static boolean[] seatNumber = new boolean[11];
	public static void canGetSeat() {
		System.out.print("Enter the flight type\nType 1 for First Class\n Type 2 for Economy");
		int type = input.nextInt();
		
		if( type == 1) {
			
			firstclass();
		} else {
			economy();
		}
	}
	
	public static void firstclass() {
		
		for(int i = 1; i <= 5; i++) {
			if((seatNumber[i]) == false) {
				seatNumber[i] = true;
				System.out.printf("%s# %d%n","First Class. Seat Number: ", i);
				break;
			}
			else if(seatNumber[5] == true) {
				if(seatNumber[10] == true)
				{
					
					 System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
					 System.exit(0);
					
				}else {
				System.out.print("First Class is completely taken.\n Press 1 to switch to economy\n and 2 to Cancel booking");
				
				int change = input.nextInt();
				
				if( change == 1) {
					economy();
					looping();
				}
				else {
					System.out.println("Next flight is in 3 hours.");
					break;
				}
				}
			}
		}
		
	}
	
	public static void economy() {
		
		for(int i = 6; i <= 10; i++) {
			if((seatNumber[i]) ==  false) {
				seatNumber[i] = true;
				System.out.printf("%s# %d%n","Economy. Seat Number: ", i);
				break;
			}
			else if(seatNumber[10] ==  true) {
				if(seatNumber[5] == true) {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                    System.exit(0);
				} else {
				System.out.print("Economy is completely taken.\n Press 1 to switch to First Class\n and 2 to Cancel booking");
				
				int change = input.nextInt();
				
				if( change == 1) {
					firstclass();
					looping();
				}
				else {
					System.out.println("Next flight is in 3 hours.");
					break;
				}
				}
			}
		}
		
	}
	
	public static void looping() {
		
		while(true) {
			canGetSeat();
		}
	}
	
	public static void main(String[] args) {
		canGetSeat();
	}
	
	
}
