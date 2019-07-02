package chapter6.exercise620;

import java.util.Scanner;
public class CircleArea {
	public static double calculateCircleArea() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		int radius = input.nextInt();
		double area = Math.PI * radius* radius;
		return area;
	}
	public static double calculateCircleArea(double radius) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		radius = input.nextDouble();
		double area = Math.PI * radius * radius;
		return area;
	}


	public static void main(String[] args) {
		System.out.println(calculateCircleArea());
		System.out.println(calculateCircleArea(2.0));
		
		//System.out.println(calculateCircleArea(2.0));
		
		
		

	}

}
