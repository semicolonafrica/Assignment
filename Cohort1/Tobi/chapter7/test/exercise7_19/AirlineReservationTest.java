package exercise7_19;

import java.util.InputMismatchException;

public class AirlineReservationTest {

public static void main(String[] args) {

		
		AirlineReservation arik = new AirlineReservation();
		try {
		arik.assignSeats();
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			try {
				arik.assignSeats();
			}
			catch(InputMismatchException c){
				System.out.println(c.getMessage());
				System.out.println(arik.bookEconomy());
			}
		}

	}
}
