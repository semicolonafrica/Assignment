/**
 * 
 */
package chapter6.exercise6_17;

import java.util.Scanner;

/**
 * @author Enmmanuel Akinbodes
 *
 */
public class EvenNumberTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter interger: ");
		int number = input.nextInt();
		
		
		System.out.println(EvenNumber.isEven(number));

	}

}
