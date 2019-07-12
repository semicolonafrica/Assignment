package chapter7Exercises;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class AirlineReservationsSystem {
	
	private String passengerName;
	private boolean []seatNumber;
	private int takeOffTime;

	SecureRandom randomNumbers = new SecureRandom();
	Scanner input = new Scanner(System.in);
//public AirlineReservationsSystem(String perssengerName, boolean []seatNumber, int takeOffTime) {
//		
//		this.passengerName = perssengerName;
//		this.seatNumber = seatNumber;
//		this.takeOffTime = takeOffTime;
//	}
	
	public String getPassengerName() {
		return passengerName;
	}

	public void setPerssengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	
//Your application should then display a boarding pass indicating the person’s
//	seat number and whether it’s in the first-class or economy section of the plane.
//	Use a one-dimensional array of primitive type boolean to represent the seating chart of the
//	plane. Initialize all the elements of the array to false to indicate that all the seats are empty. As
//	each seat is assigned, set the corresponding element of the array to true to indicate that the seat is
//	no longer available.
//	Your application should never assign a seat that has already been assigned. When the economy
//	section is full, your application should ask the person if it’s acceptable to be placed in the first-class
//	section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
//	"Next flight leaves in 3 hours."

	
	public void makeBooking() {
		
		boolean seatNumber[] = new boolean[10];
		
		int counter =0;
		int bookSeat;
		int temp =0;
		
		while(counter<10) {
			
		System.out.println("Please type 1 for First Class \r\nor type 2 for Economy");
		int classType = input.nextInt();
		
		
		if(classType ==1) {
			
			temp = generateFirstClassSeat();
			bookSeat = temp;
			
			if(seatNumber[temp-1]==false) {
				seatNumber[bookSeat-1] = true;
				System.out.println("You booked first class and seat number is: "+ bookSeat);
			}
			else if(seatNumber[temp-1]==true) {
				while (seatNumber[temp-1]==true) {
					temp= generateFirstClassSeat();
					bookSeat = temp;
					
					if(seatNumber[temp-1] ==false) {
						break;
					}
				}
				seatNumber[bookSeat] = true;
				
			System.out.println("You booked first class and seat number is: "+ bookSeat);
			}
		}
		
		else {
			temp = generateEconomySeat();
			bookSeat = temp;
			if(seatNumber[temp-1]==false) {
				seatNumber[bookSeat-1] = true;
				
				System.out.println("You booked first class and seat number is: "+ bookSeat);
			}
			else if (seatNumber[temp-1] == true) {
				while (seatNumber[temp-1] == true) {
					temp = generateEconomySeat();
					bookSeat = temp;
					
					if(seatNumber[temp-1]==false) {
						break;
					}
				}
				seatNumber[bookSeat-1] = true;
			System.out.println("You booked Economy seat number is: "+ bookSeat);
			}
		}
		counter++;
		if(counter ==10) {
			System.out.println("All seats has been booked, next flight leaves int the next 3hrs");
			break;
		}
		}
	
	}
	
	public int generateFirstClassSeat() {
		int firstClassSeat = 1 + randomNumbers.nextInt(5);
		return firstClassSeat;
		
	}
	public int generateEconomySeat() {
		int EconomySeat = 6 + randomNumbers.nextInt(5);
		return EconomySeat;
		
		
	}

}
