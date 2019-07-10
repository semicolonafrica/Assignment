package exercise7_19;
import java.util.Scanner;
public class AirlineReserveSystem {
	
	Scanner input = new Scanner(System.in);
	public static boolean checkOccupiedSeats(boolean []  number) {
		boolean status = false;
		
		for(int x = 0; x <= number.length; x++) {
			if(number[x] == false)
				status = true;
		}
		return status;
	}
	
	public void assignSeats() {
		boolean[] numberOfSeats = new boolean [10];
		int seats;
		int firstClass = 0;
		int economy = 5;
		int counter = 0;
		int choice = 0;  
		String decide = "";
			while(checkOccupiedSeats(numberOfSeats)) {
				
		System.out.print("Type 1 for First Class or Type 2 for Economy: ");
		seats = input.nextInt();
		
		if(seats == 1) {
			
			if(firstClass < 5) {
			numberOfSeats[firstClass] = true;
			System.out.println("Your seat number is: " + firstClass);
			}
			if(firstClass >= 6 ) {
				System.out.println("First class is filled, Book seats for economy");
				decide = input.next();
				if(decide.equalsIgnoreCase("No")) {
					System.out.println("Next flight leaves in 3hours");
					break;
				}
			}
			firstClass++;
			
		}
		if(seats == 2) {
			numberOfSeats[economy] = true;
			economy++;
			System.out.println("Your seat number is: "+ economy);
		}
		counter++;
	}
}
	
	public static void main(String[] args) {
		AirlineReserveSystem check = new AirlineReserveSystem();
		check.assignSeats();

	}

}
