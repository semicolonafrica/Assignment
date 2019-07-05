package chapter6.exercise6_32;
import java.util.Scanner;
//Write method distance to calculate the
//distance between two points (x1, y1) and (x2, y2). All numbers and return
//values should be of type double. Incorporate this method into an
//application that enables the user to enter the coordinates of the points.

public class DistancePoint {
	
	public static double displayDistance() {
		Scanner input = new Scanner(System.in);
		
		double horizotal;
		double vertical;
		double store;
			
		System.out.println("enter x1");
		double x1 = input.nextDouble();
		System.out.println("enter x2");
		double x2 = input.nextDouble();
		System.out.println("enter y1");
		double y1 = input.nextDouble();
		System.out.println("enter y2");
		double y2 = input.nextDouble();
		
		horizotal = x2 - x1;
		vertical = y2 - y1;
		
		double total = Math.sqrt(horizotal + vertical);
		
		System.out.println(total);
		return total;
		
	
	}
	

}
