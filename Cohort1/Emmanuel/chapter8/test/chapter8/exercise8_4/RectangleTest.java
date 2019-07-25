/**
 * 
 */
package chapter8.exercise8_4;

import java.awt.Shape;
import java.util.Scanner;

/**
 * @author USER
 *
 */
public class RectangleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Rectangle shape = new Rectangle(1.0, 1.0);
		
		System.out.println("Enter Length");
		double length = input.nextDouble();
		shape.setLength(length);
		
		
		System.out.println("Enter Width");
		double width = input.nextDouble();
		shape.setWidth(width);
		
	
		
		System.out.printf("Area is: %.2f%n", shape.calArea());
		System.out.printf("Perimeter is: %.2f%n", shape.calPerimeter());
		

	}

}
