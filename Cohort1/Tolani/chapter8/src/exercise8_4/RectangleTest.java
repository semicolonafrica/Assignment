package exercise8_4;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		
		Scanner insert = new Scanner(System.in);
		
		Rectangle rec1 = new Rectangle(1.0,1.0);
		
		
		
		System.out.println("Enter length");
		
		double length = insert.nextDouble();
		
		rec1.setLength(length);
		
		System.out.println("Enter width");
		
		double width = insert.nextDouble();
		
		rec1.setWidth(width);
		//System.out.println(rec1.calculateArea());
		
		System.out.printf("Area is: %.1f%nPerimeter"
				+ " is: %.1f",rec1.calculateArea(),rec1.calculatePerimeter());

		insert.close();
	}

}
