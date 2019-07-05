package chapter6.exercise632;
// import Scanner class
import java.util.Scanner;
public class Distance {
	
	
	
	public static void calculateDistance() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter x1");
		double x1 = input.nextDouble();
		System.out.println("enter y1");
		double y1 = input.nextDouble();
		System.out.println("enter x2");
		double x2 = input.nextDouble();
		System.out.println("enter y2");
		double y2 = input.nextDouble();
		
		Distance.calculateDistance(x1, y1, x2, y2);
		//double distance = Math.sqrt((Math.pow((x2-x1), 2)+(Math.pow((y2-y1), 2))));
		
	}
	
	public static double calculateDistance(double a1, double b1, double a2, double b2) {
		
		double distance = Math.sqrt((Math.pow((a2-a1), 2)+(Math.pow((b2-b1), 2))));
		System.out.println("The distance between the points is: " + distance);
		
	
	return distance;
	}

}
