package chapter7.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

//Program written by Oyemade Temitope 
//Exercise 7.19
//5th of July 2019

public class AirLineReservationSystem {
	
	 boolean[] seats = new boolean[10];
	
	
	public static boolean checkIfPlaneSeatsAreFilled(boolean[] array) {
		
		boolean status = false;
		
		for(int y=0; y<array.length; y++) {
			
			if(array[y] == false)
				status = true;
		}
		return status;
	} 
	
	
	public void reservationSystem() {
		
		int number =0;
		Scanner input = new Scanner(System.in);
		int x =0;
		int y = 5;
		
		System.out.println("Please type 1 for First Class and 2 for Economy");
		
		while((checkIfPlaneSeatsAreFilled(seats))) {
			
			System.out.println("\nBook Flight!");
			try {
			number = input.nextInt();
			
			
			
			
			if(number >2 || number <1 )
				System.out.println("Oops! book First class or Economy class");
			
		
		if(number == 1) { 
			
			if(x <5) {
				
				seats[x] = true;
			System.out.printf("Category: First Class%nSeat Number: %d%n", x+1);
			
			}
			
			x++;
			
			if(x >=6 ) {
				
				System.out.printf("Opps! our"
						+ " First Class is filled "
						+ "will you like to switch to our economy section?\n"
						+ "Yes or No\n");
			
					String decision = input.next();
				if(decision.equalsIgnoreCase("No")) {
					System.out.printf("%nNext Flight leaves in 3hours%n");
				break;
				}
			}
		}
		
			
		try {
			
		if(number == 2) { 
			seats[y] = true;
			
			System.out.printf("Category: Economy Class%nSeat Number: %d%n", y+1);
			y++;	
			}
		}
			
		catch(ArrayIndexOutOfBoundsException  e) {
			
			System.out.printf("Opps! our"
					+ " Economy Class is filled "
					+ "will you like to switch to our First Class section?\n"
					+ "Yes or No\n");
			
			String decision = input.next();
			
			if(decision.equalsIgnoreCase("No")) {
				System.out.printf("%nNext Flight leaves in 3hours");
				break;
				
			}
			
		}
		
			}
			catch(InputMismatchException e) {
				System.out.println("Oops you inputed an invalid number\nTry again");
				
				input.nextLine();
			}
			
		}
		input.close();
	}
		
	}

