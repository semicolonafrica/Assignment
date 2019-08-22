package chapter7.exercise7_19;
import java.util.Scanner;
import java.security.SecureRandom;
public class AirlineSystem {
	
	Scanner input = new Scanner(System.in);
	SecureRandom randomNumber = new SecureRandom();
	
	   public void bookAirLine() {
			
	   boolean seat[]= new boolean[10];

	   int counter =0;
			
		while(counter <10) {
				System.out.println("Enter 1 for first class or 2 for economy class");
				int number = input.nextInt();
				int bookSeat;
				int temp =0;
				if(number==1) {
					temp = generateFirstClassNumber();
					bookSeat = temp;
					if(seat[temp-1] == false) {
						seat[bookSeat-1]=true;
						System.out.println("You booked first class, seat number is " + bookSeat);
						}
					else if(seat[temp-1] == true) {
						while(seat[temp-1]==true) {
							temp = generateFirstClassNumber();
							bookSeat = temp;
							if(seat[temp-1]== false) {
								break;
							}
					}
						seat[bookSeat-1]=true;
					System.out.println("You booked first class, seat number is " + bookSeat);
					}
				}
					
				else {
					temp = generateSecondClassNumber();
					bookSeat = temp;
					if(seat[temp-1] == false) {
							seat[bookSeat-1] = true;
							System.out.println("You booked second class, seat number is " + bookSeat);
					}
					else if(seat[temp-1]== true) {
						while(seat[temp-1]== true) {
							temp = generateSecondClassNumber();
							bookSeat = temp;
							if(seat[temp-1]== false) {
								break;
							}
						}
					seat[bookSeat-1]=true;
					
					System.out.println("You booked second class, seat number is " + bookSeat);
					}
					
				}
				counter++;
				if (counter==10) {
					System.out.println("All seat has been booked, next flight leaves in 3hrs");
					break;
				}
			}
				
				
		}
			
		public int generateFirstClassNumber() {
			int firsClassNumber = 1+ randomNumber.nextInt(5);
			return firsClassNumber;
		}
		public int generateSecondClassNumber() {
			int secondClassNumber = 6+ randomNumber.nextInt(5);
			return secondClassNumber;
		}

	}