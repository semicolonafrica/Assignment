package exercise6_15;

import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		Scanner insert = new Scanner(System.in);
		Triangle triangle = new Triangle();
		
		int counter = 1;
		while(counter <=3) {
		System.out.println("Enter value: ");
		double side1 = insert.nextDouble();
		System.out.println("Enter value: ");
		double side2 = insert.nextDouble();
		System.out.println("The value of the hypotenuse: " + triangle.hypotenuse(side1, side2));
		counter++;
		}

	}

}
