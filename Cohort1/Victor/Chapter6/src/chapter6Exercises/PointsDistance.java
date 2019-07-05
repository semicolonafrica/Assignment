package chapter6Exercises;

import java.util.Scanner;

public class PointsDistance {
//	.32 (Distance Between Points) Write method distance to calculate the distance between two
//	points (x1, y1) and (x2, y2). All numbers and return values should be of type double. Incorporate
//	this method into an application that enables the user to enter the coordinates of the points.
	
	public static void calculateDistance() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value x1");
		double x1 = input.nextDouble();
		System.out.println("Enter value x2");
		double x2 = input.nextDouble();
		System.out.println("Enter value y1");
		double y1 = input.nextDouble();
		System.out.println("Enter value y2");
		double y2 = input.nextDouble();
		
		System.out.println("The calculated distance is: "+PointsDistance.distance(x1, x2, y1, y2));
		input.close();
	}
	
	public static double distance(double x1, double x2, double y1, double y2) {
		double distance = (y2-y1)/(x2-x1);
		return distance;
		
	}
	
}
