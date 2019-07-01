/**
 * 
 */
package chapter6.exercise6_27;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class GreatestCommonDivTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println(GreatestCommonDiv.checkGreatestDiv(num1, num2));
		//GreatestCommonDiv.checkGreatestDiv(num1, num2);

	}

}
