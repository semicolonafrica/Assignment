package chapter4.exercise417;
import java.util.Scanner;

public class GasMileage {
	public double calculateMileage(){
	Scanner input  = new Scanner(System.in);
	System.out.println("Enter number of trips: ");
	int trip = input.nextInt();
	int miles = 0;
	int gallon = 0;
	double milesPerGallon = 0 ;
	double total = 0;
	double average;
	int counter =1;
	while (counter<= trip) {
		System.out.println("Enter miles ");
		miles = input.nextInt();
		System.out.println("Enter Gallon used: ");
		gallon = input.nextInt();
		milesPerGallon = miles/gallon;
		System.out.println("trip " + counter + " = " + milesPerGallon + "miles/gal" );
		total = total + milesPerGallon;
		counter++;
	}
	average = total/trip;
	return average;
	}
}
