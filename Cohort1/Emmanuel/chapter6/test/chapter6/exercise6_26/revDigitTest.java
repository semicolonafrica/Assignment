/**
 * 
 */
package chapter6.exercise6_26;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class revDigitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		
		 System.out.println("Enetr number: ");
		 int num = input.nextInt();
		System.out.println(revDigit.reverseDigit(num));
		//revDigit.reverseDigit(num);

	}

}
