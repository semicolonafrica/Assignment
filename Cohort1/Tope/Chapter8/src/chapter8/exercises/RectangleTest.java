package chapter8.exercises;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean state = true;
		double length = 1, width = 1;
		Rectangle rectangle = new Rectangle(length, width);
		
		while(state) {
		
		try {
		
		System.out.println("Enter length of rectangle");
		length = input.nextDouble();
		
		System.out.println("Enter width of rectangle");
		 width = input.nextDouble();
		 
		 
		 rectangle.setLength(length);
		 rectangle.setWidth(width);
		
		state = false;
		
		}
		catch(IllegalArgumentException e ) {
			
			System.out.println("Enter length and width in range >0.0 and <=20.0 ");
			input.nextLine();
		}
		
		}
		
		System.out.printf("The perimeter of the Rectangle = %.2f%n", rectangle.calculatePerimeter());
		System.out.printf("The Area of the rectangle = %.2f", rectangle.calculateArea());
		
		input.close();
	}

}
