/**
 * 
 */
package chapter6.exercise6_18;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class SquareTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner input = new Scanner(System.in);
	
	//Square print = new Square();
	
	System.out.println("Enter number of sides: ");
	int number = input.nextInt();
	
	Square.printSquare(number);

	}

}
