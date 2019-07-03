/**
 * 
 */
package exercise6_32;

import java.util.Scanner;

/**
 * @author ken_granero
 *
 */
public class DistanceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner insert = new Scanner(System.in);
		
		System.out.print("Enter number for x1: ");
		double x1 = insert.nextDouble();
		
		System.out.print("Enter number for x2: ");
		double x2 = insert.nextDouble();
		
		System.out.print("Enter number for y1: ");
		double y1 = insert.nextDouble();
		
		System.out.print("Enter number for y2: ");
		double y2 = insert.nextDouble();
		
		System.out.println("The ditsnace is"+Distance.calculateDistance(x1, x2, y1, y2));
		
		insert.close();

	}

}
