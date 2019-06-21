package chapter6.exercise68;
import java.util.Scanner;
public class ParkingCharges {
	
	
	
	public static double calculateCharges(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of hour");
		int time = input.nextInt();
				
		
		double charges =0;
		double total = 0;
		
		if ( time <= 3) {
			
			charges = time * 2.0;
		}
		else {
			time -= 3;
			charges = time * 0.381 + 2;
		}
		
		if (charges >= 10.0) {
			
			charges = 10.0;
		}
		
		
		
		total += charges;
		System.out.println(total);
		
		
		
		return total;
	}

}
