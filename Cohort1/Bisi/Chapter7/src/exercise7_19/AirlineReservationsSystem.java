package exercise7_19;
import java.util.Scanner;
import java.security.SecureRandom;;
public class AirlineReservationsSystem {
	
	public void bookAirLine() {
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumber = new SecureRandom();
		
		boolean[] seat = new boolean[11];
		int counter;
		int temp = 1;
			for(counter = 1; counter < seat.length; counter++) {
		System.out.println(counter +"\t"+ seat[counter]);	
		}
		
	for(int count = 1; count < 5; count++) {
		System.out.println("Enter 1 for First-Class Seat; 2 for Economy-Class Seat:");
		int number = input.nextInt();
							
		if(number == 1) {
			int	bookSeat = 1 + randomNumber.nextInt(5);				
			if(seat[count] == false) {						
		//	bookSeat = temp;
				temp++;
			}
			else if(seat[counter] == true) {				
					bookSeat = 1 + randomNumber.nextInt(5);	
					bookSeat = temp;
			}
			System.out.println("You booked a First-Class Seat, with seat number: " + temp);
		}
			
		else if(number == 2) {
			int	bookSeat = 6 + randomNumber.nextInt(5);
			if(seat[count] == true) {
				bookSeat = 6 + randomNumber.nextInt(5);
				bookSeat = temp;
				}
			else if(seat[counter] == false) {
				bookSeat = temp;
			}
				System.out.println("You booked an Economy-Class Seat, with seat number: " + temp);
				}	
				count++;
		}		
	}
}


