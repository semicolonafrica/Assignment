/**
 * 
 */
package chapter6.exercise6_32;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class DistanceBetweenTwoPointsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double x1 = input.nextInt();
		double y1 = input.nextInt();
		double x2 = input.nextInt();
		double y2 = input.nextInt();
		
		DistanceBetweenTwoPoints.calDistance(x1, y1, x2, y2);

	}

}
