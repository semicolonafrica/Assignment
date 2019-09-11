/**
 * 
 */
package chapter4.exercise4_32;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class BinaryTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Binary bum =  new Binary();
		
		System.out.print("Enter your number");
		int number = input.nextInt();
		
		bum.setNumber(number);
		
		System.out.println(bum.convertBinary());

	}

}
