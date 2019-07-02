package chapter6.exercise20;

import java.util.Scanner;
public class CircleArea {

	public void circleArea() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius or -1 to exit: ");
		
		
		double radius = input.nextDouble();
		
		while(radius != -1) {
		double area = 2 * Math.PI * radius;
		
		System.out.printf("Area of the circle is: %.4f\n", area);
		
		
		System.out.println("Enter number: ");
		
		
		radius = input.nextDouble();
		
		}
	}
}
