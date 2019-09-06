package exercise417;

import java.util.Scanner;

public class GasMileageTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		GasMileage mileage = new GasMileage();
		
		int miles;
		int gallons;
		boolean trip = true;
		int count = 1;
		
		while (trip != false) {
			

			System.out.println("\n----------------------------\n");
			
			System.out.print("Enter miles driven for Trip: ");
			miles = input.nextInt();
			
			System.out.print("Enter gallons used for Trip: ");
			gallons = input.nextInt();
			
			System.out.println("\n----------------------------");
			
			System.out.printf("Mileage for Trip %d: %.2f\n", 
					count, mileage.milesPG(miles, gallons));
			
			
			System.out.print("\nEnter another trip (true/false): ");
			trip = input.nextBoolean();
			
			count++;
			
		}
		
		System.out.println("\n----------------------------\n");

		System.out.printf("Total Mileage for Trips: %.2f", 
				count, mileage.getTotalMPG());
		
		input.close();
	}

}
