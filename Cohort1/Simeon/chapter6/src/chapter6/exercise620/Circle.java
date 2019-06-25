package chapter6.exercise620;

import java.util.Scanner;

public class Circle {

	public static void circleArea()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius of circle: ");
		int r = input.nextInt();
		
		double pi = Math.PI;
		
		double result = pi *(r * r);
		
		System.out.printf("Area of Circle = %.2f", result);
	}
	
	
	
}
