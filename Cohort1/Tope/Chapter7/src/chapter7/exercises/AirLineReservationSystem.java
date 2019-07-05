package chapter7.exercises;

import java.util.Scanner;

//Program written by Oyemade Temitope 
//Exercise 7.19
//5th of July 2019

public class AirLineReservationSystem {
	
	 boolean[] seats = new boolean[10];
	
	
	public static boolean checkifArrayisFilled(boolean[] array) {
		
		boolean status = false;
		
		for(int y=0; y<array.length; y++) {
			
			if(array[y] == false)
				status = true;
		}
		return status;
	} 
	
	
	
	
	public void reservationSystem() {
		int number;
		Scanner input = new Scanner(System.in);
		int x =0;
		int y = 4;
		
		
		System.out.println("Please type 1 for First Class and 2 for Economy");
		
		while((checkifArrayisFilled(seats))) {
			
			System.out.println("\nBook Flight!");
		number = input.nextInt();
		if(number == 1 ) { 
			
			seats[x] = true;
			
			System.out.printf("Category: First Class%nSeat Number: %d%n", x);
			x++;
			if(x ==6 ) {
				
				System.out.printf("Opps! our"
						+ " First Class is filled "
						+ "will you like to switch to our economy section?\n"
						+ "Yes or No\n");
			
					String dec = input.next();
				if(dec.equalsIgnoreCase("No")) {
					System.out.printf("%nNext Flight leaves in 3hours%n");
				break;
				}
			
			if(dec.equalsIgnoreCase("Yes"))
			number = input.nextInt();
			}
		}
			
		
		if(number == 2) { 
			
			seats[y] = true;
			
			System.out.printf("Category: Economy Class%nSeat Number: %d%n", y);
			y++;
		
		if(y ==10 ) {
			
			System.out.printf("Opps! our"
					+ " Economy Class is filled "
					+ "will you like to switch to our First Class section?\n"
					+ "Yes or No\n");
			
			String decision = input.next();
			
			if(decision.equalsIgnoreCase("No")) {
				System.out.printf("%nNext Flight leaves in 3hours");
				break;
				
			}
			
			if(decision.equalsIgnoreCase("Yes"))
				number = input.nextInt();
				
		}
			
		
		}
		}
		
		input.close();
		
	}

}
