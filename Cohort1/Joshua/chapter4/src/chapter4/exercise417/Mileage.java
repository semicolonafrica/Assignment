package chapter4.exercise417;
// 1. Collect number of trips(x)
// 2. Collect miles and gallons x times
// 3. Divide miles by gallon used for each trip
// 4. Add total miles per gallon.
// 5. Divide total miles per gallon by number of trips(x).

import java.util.Scanner;
public class Mileage {
	Scanner input = new Scanner(System.in);
	
	public double calculateMileage() {
		
		
		System.out.println("Enter number of trips");
		int trip;
		 trip = input.nextInt();
		int miles = 0;
		int gallon = 0;
		double milesPerGallon = 0;
		double total = 0;
		double average = 0.0;
		int counter = 1;
		
		//using while loop for the program
		
		while(counter <= trip) {
			System.out.println("Enter miles");
			miles = input.nextInt();
			if(miles == -1) {
				break;
			}
			
			
			System.out.println("Enter gallon used");
			gallon = input.nextInt();
			if(gallon == -1) {
				break;
			}
			
			
			milesPerGallon = miles/gallon;
			System.out.println("trip " + counter + "= " + milesPerGallon);
			total = total + milesPerGallon;
			counter++;
		}
	
		
		
		average = total/trip;
		return average;
	}

}
