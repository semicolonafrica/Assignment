/**
 * 
 */
package chapter6.exercise6_21;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class DigitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value for number: ");
		int number = input.nextInt();
		if(number >1 || number <= 99999) {
			System.out.println("Number is : " + Digits.displayDigits(number));
			
		}
				

	}

}
