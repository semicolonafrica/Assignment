/**
 * 
 */
package chapter6.exercise6_28;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class AverageTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter student point: ");
		int point = input.nextInt();
		
		System.out.println(Average.qualityPoints(point));
		//Average.qualityPoints(point);

	}

}
