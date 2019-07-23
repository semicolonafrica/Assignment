package chapter8;

import java.util.Scanner;

public class RectangleClassTest {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter length: ");
		double length = input.nextDouble();
		
		System.out.print("Enter width: ");
		double width = input.nextDouble();
		
		RectangleClass rectangle = new RectangleClass(length, width);
		
		
		
		
			System.out.printf("%s", rectangle.toString());

	}

}
