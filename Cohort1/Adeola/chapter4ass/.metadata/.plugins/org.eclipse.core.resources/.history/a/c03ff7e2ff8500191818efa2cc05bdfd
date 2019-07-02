import java.util.Scanner;
public class Mileage{
	public double calculateMileage() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of trip :");
		int trip = input.nextInt();
		
		int miles = 0;
		int gallons = 0;
		double milesPerGallon = 0;
		double total = 0;
		double average = 0;
		int counter = 1;
		while (counter <= trip) {
			System.out.println("Enter miles :");
			miles = input.nextInt();
			System.out.print("Enter gallons :");
			gallons = input.nextInt();
			milesPerGallon = miles/gallons;
			System.out.println("trip " + counter + " = " + milesPerGallon);
			counter++;
		}
		average = total/trip;
		return average;
	}
}
