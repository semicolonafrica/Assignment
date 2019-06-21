package Chapter6.exercise6_20;

import java.util.Scanner;
public class AreaOfCircle {

	public static void calcAreaOfCircle() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Integer for radius:  ");
		double radius = input.nextDouble();
		
		double area = Math.PI * radius * radius;
		System.out.println("Area of a circle with radius " + radius + " is " + area);
	}
	
	public static void main(String[] args) {
		
		AreaOfCircle.calcAreaOfCircle();
	}
}
