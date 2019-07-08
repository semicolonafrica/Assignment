/**
 * 
 */
package exercise6_26;

import java.util.Scanner;

/**
 * @author ken_granero
 *
 */
public class ReverseNumberTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner insert = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = insert.nextInt();
		
		System.out.println("The reversed number is "+ReverseNumber.reverseDigits(number));
		
		insert.close();

	}

}
