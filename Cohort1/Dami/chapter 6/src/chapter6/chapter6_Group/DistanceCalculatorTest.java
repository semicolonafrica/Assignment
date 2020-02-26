package chapter6.chapter6_Group;

import java.util.Scanner;

public class DistanceCalculatorTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter point A, Latitude");
		double x1 = input.nextDouble();
		
		System.out.print("Enter point A, Longitude");
		double y1 = input.nextDouble();
		
		System.out.print("Enter point B, Latitude");
		double x2 = input.nextDouble();
		
		System.out.print("Enter point B, Longitude");
		double y2 = input.nextDouble();
		
		System.out.println("Distance between the two cordinates is " + DistanceCalculator.calculateDistance(x1, y1, x2, y2));
	}

}
