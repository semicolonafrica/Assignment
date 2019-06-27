package exercise6_32;

import java.util.Scanner;

public class DistanceBetweenPoints {
	public static double distance() {
		
		Scanner i = new Scanner(System.in);
		
		System.out.print("Enter the point1:");
		double point1 = i.nextDouble();
		
		System.out.print("Enter the point2:");
		double point2 = i.nextDouble();
		
		System.out.print("Enter the point3:");
		double point3 = i.nextDouble();
		
		System.out.print("Enter the point4:");
		double point4 = i.nextDouble();
		
		double A = Math.pow((point2 - point1), 2.0);
		double B = Math.pow((point4 - point3), 2.0);
		double C = A + B;
		double distance = Math.sqrt(C);
		
		return distance;
		
	}
	public static void main(String[] args) {
		
		DistanceBetweenPoints.distance();
	}

}
