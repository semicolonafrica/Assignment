package exercise4_17;
import java.util.Scanner;

public class GasMileageTest {
	public static void main(String[] args) {
		GasMileage motor = new GasMileage();
		
		Scanner in = new Scanner(System.in);		
		
		float totalTrip = 0;
		int count = 0;
		
		System.out.print("Enter miles covered or -1: ");
			int miles = in.nextInt();
			motor.setMilesDriven(miles);
		
		System.out.print("Enter gallon used: ");
			int gallon = in.nextInt();
			motor.setGallonUsed(gallon);
		
	//	System.out.println("The trip for the given data is: " + motor.getTrip(0) + "m" );
		
		while(miles != -1) {		
			totalTrip = (float) (totalTrip + motor.getTrip(0));
			count++;
			System.out.print("Enter miles  or -1: ");
				miles = in.nextInt();
				motor.setMilesDriven(miles);
			 
			 System.out.print("Enter gallon used: ");
				 gallon = in.nextInt();	
				 motor.setGallonUsed(gallon);				 
		}						
		if(count != 0) {
			float averageTrip = (float) totalTrip / count;
			System.out.println("The total Trip for the given data above is: " + totalTrip + "m");
			System.out.println();
			System.out.println("The average trip for the given data above is: " + averageTrip + "m");
		}
		else {
			System.out.print("No trip was entered!");
		}
	}

}

