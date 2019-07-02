package chapter6;
import java.util.Scanner;

public class ParkingChargesTest {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ParkingCharges obj = new ParkingCharges();
		int hoursParked=0;
		
		System.out.println("Enter number of users to process ");
		int user = input.nextInt();
		
		System.out.println("User	Charge ");
		
		for(int i = 1; i <= user; i++) {		
		System.out.print("Enter number of hours:" );
		hoursParked = input.nextInt();
		//obj.calculateCharge(hoursParked);
		//System.out.printf("User %d \t %.2f %n ", i, obj.calculateCharge(hoursParked));	
	}	
		obj.calculateCharge(hoursParked);

}
}
