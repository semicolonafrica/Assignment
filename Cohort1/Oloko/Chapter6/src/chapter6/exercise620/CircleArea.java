package chapter6.exercise620;

import java.util.Scanner;

public class CircleArea{
	
	public static double circleArea(int radius) {
		
		double area =0;
		area = Math.PI * Math.pow(radius,2);
		
		
		return area;
		
	}
	
	public static void main(String[]args) {
		
		Scanner circle = new Scanner(System.in);
		System.out.println("Enter Radius");
		int radius = circle.nextInt(); 
		circle.close();
		
		System.out.println(circleArea(radius));
	
	}
	
	
	
	
	
	
	
	
}