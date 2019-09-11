/**
 * 
 */
package chapter6.exercise6_16;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class MultipleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
	
		
		System.out.println("Enter value for num1: ");
		int num1 = input.nextInt();
		System.out.println("Enter valur for num2: ");
		int num2 = input.nextInt();
		
		Multiple.checkMultiple(num1, num2);

	}

}
