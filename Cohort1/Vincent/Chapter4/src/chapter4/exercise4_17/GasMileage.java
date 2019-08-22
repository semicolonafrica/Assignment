package chapter4.exercise4_17;
import java.util.Scanner;
public class GasMileage {

	public int calculateMiles() {
			Scanner input = new Scanner(System.in);
			int miles=0;
			int gallon=0;
			int total= 0;
			int milesPerGallon =0;
			System.out.println("enter miles driven");
			miles = input.nextInt();
		while(miles != -1) {
			System.out.println("enter liter of gallon used");
			gallon = input.nextInt();
			
			milesPerGallon = miles / gallon;
			
			System.out.println("enter miles driven");
			miles = input.nextInt();
			
			}
		    total = total + milesPerGallon;
		    
		    System.out.printf("miles pergallon for each trip: %d%ntotal of all trips gone: %d%n", milesPerGallon, total);
			return total;
	}
}
