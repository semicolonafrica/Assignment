package chapter7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Airliner {

	//Assign seats on each flight of the airline's only plane
	//seat 1-5 First Class
	//Seat 6-10 Economy
	
	//One-dimensional array of type boolean to represent 
	//the seating chart of the plane
	
	//False and then true
	//When seat are full in either first Class or Economy assign alternative
	private int userChoice;
	private int current;
	private boolean[] seatingChartIsEmpty;
	private boolean seatBooked;
	private int CAPACITY = 10;
	private int seats = CAPACITY;
	private Scanner input;
	
	public Airliner() {
		this.seatingChartIsEmpty = new boolean[CAPACITY];
		setSeat();
		this.seatBooked = true;
		
	}
	
	public boolean[] getSeatingChartIsEmpty() {
		return seatingChartIsEmpty;
	}
	public void setSeatingChartIsEmpty(boolean[] seatingChartIsEmpty) {
		this.seatingChartIsEmpty = seatingChartIsEmpty;
	}

	
//	public boolean initializeIsSeatingChart(int assigned) {
//		
//		for(int i = 0; i < getSeatingChartIsEmpty().length;i++) {
//			boolean status = false;
//			
//		}
	//Initialize all the elements of the array
	private void setSeat() {
		for(int i = 0; i < seatingChartIsEmpty.length; i++) {
			seatingChartIsEmpty[i] = false;
		}
		
	}
	
	public void displayMenu() {
		
		// if no more seats available in the flight, display the message
		do {
		if (seats == 0) {
				System.out.println();
				System.out.println("No more available seats in this flight.");
				System.out.println("Thank you for using our system");
				break;
				}
		
		System.out.println("***** Airline Reservation System *****");
		System.out.println(" Menu Options ");
		System.out.println(" 1 - First Class ");
		System.out.println(" 2 - Economy Class ");
		System.out.println(" 3 - Exit ");
		System.out.println("**************************************");
		System.out.println("Please choose your option: ");
		input = new Scanner(System.in);
		
		try {
			userChoice = input.nextInt();
			while (userChoice != 1 && userChoice != 2 && userChoice != 3) {
				System.out.println("Please choose either '1', '2' or '3'");
				displayMenu();
			}
		} catch(InputMismatchException e) {
			System.err.println("Not a valid number: " + userChoice);
		}
		seatBooked = assignSeats(userChoice);
		} while(seatBooked);
	}
	
	public boolean assignSeats(int userChoice) {
		//First class section
		switch(userChoice) {
		case 1:
			
			for(current = 0; current < 5; current++) {
				if(seatingChartIsEmpty[current] == false) {
					seatingChartIsEmpty[current] = true;
					printBoardingPass(current + 1);
					seats--;
					seatBooked = true;
					
					break;
				}
			}
			// if economy class section is full, prompt user to choose other
			// class
			if (current == 5) {
			chooseOtherClass();
			}
			break;
			case 2:
			for (current = 5; current < 10; current++) {
			if (seatingChartIsEmpty[current] == false) {
				seatingChartIsEmpty[current] = true;
			printBoardingPass(current + 1);
			seats--;
			seatBooked = true;
			break;
			}
			}

			// if economy class section is full, prompt user to choose other
			// class
			if (current == 10) {
			chooseOtherClass();
			}
			break;
			case 3:
			System.out.println("Thank you for using our system. Goodbye!");
			System.exit(0);

			default:
			System.out.println("Invalid input. Please type again");
			seatBooked = true;
			}
			return seatBooked;
		}
	
		private boolean chooseOtherClass() {
		do {
		System.out
		.println("There are no more seats available for the chosen class.n");
		System.out
		.println("Do you want to choose another class? Type 'Y' for Yes or 'N' for No");

		String ans = input.next();
		if (ans.equalsIgnoreCase("Y")) {
		seatBooked = true;
		} else if (ans.equalsIgnoreCase("N")) {
		System.out.println("Next flight leaves in 3 hours.");
		System.out.println();
		break;
		} else {
		System.out.println("nInvalid input.");
		}

		} while (!seatBooked);
		return seatBooked;

		}
		
		// Print the boarding pass with the seat number and class section
		public void printBoardingPass(int seatNum) {

		System.out.println("***** Boarding Pass *****");
		System.out.println();
		System.out.println("Seat number: " + (seatNum));
		if (seatNum <= 5) {
		System.out.println("You've been assigned to first class.");
		} else {
		System.out.println("You've been assigned to economy class.");
		}
		System.out.println("Thank you for using our system. Have a safe flight!");
		System.out.println();
		System.out.println("*************************");
		System.out.println();

		}
}


