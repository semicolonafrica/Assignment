/**
 * 
 */
package chapter6.exercise6_24;

import java.util.Scanner;

import chaapter5.exercise6_24.PerfectNumber;

/**
 * @author USER
 *
 */
public class PerfectNumbertest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = input.nextInt();
		//int x = input.nextInt();
		
		//System.out.println(PerfectNumber.NRoot(num));
		PerfectNumber.displayPerfectNumbers(num);
		//PerfectNumber.perfectNumber(num);

	}

}
