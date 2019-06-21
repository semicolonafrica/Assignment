package exercise6_20;

import java.util.Scanner;

public class AreaOfCircle {

	public static double circleArea(double radius) {
		
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		int rad = input.nextInt();
		
		System.out.printf("Area of circle is: %.2f", circleArea(rad));
	}
}
