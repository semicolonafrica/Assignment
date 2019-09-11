/**
 * 
 */
package chapter6.exercise6_19;

import java.util.Scanner;

import chapter6.exercise6_18.Square;

/**
 * @author Emmanuel Akinbode
 *
 */
public class SquareCharacterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//Square print = new Square();
		
		System.out.println("Enter number of sides: ");
		int number = input.nextInt();
		
		System.out.println("Enter charater: ");
		char fill = input.next().charAt(0);
		
		SquareCharacters.printSquareCharacter(number, fill);

		

	}

}
