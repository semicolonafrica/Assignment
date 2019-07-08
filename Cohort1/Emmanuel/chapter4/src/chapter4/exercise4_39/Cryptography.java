/**
 * 
 */
package chapter4.exercise4_39;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Cryptography {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
  		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = input.nextInt();
		
		
		int remainder = 1;
		int counter = 0;
		int x = 0;
		int d=0;
		int c=0;
		int digit1, digit2, digit3, digit4 = 0;
		
		while(counter < 5) {
			 x = num % 10;
			 remainder =( 7 + x) % 10;
			 	
								
			 num = num/10;
			 
			 counter++;
			 
		// System.out.print(remainder);
		// System.out.print("");
		
		//digit1 = remainder;
		digit1 = remainder % 10;
		System.out.print(digit1); 
			
		}
		//c = remainder;
		//remainder = remainder/ 10;
		//digit1 = remainder;
		//digit1 = remainder % 10;
		//System.out.println(digit1);
		//c = remainder;
		//c= c/10;
		//System.out.println(c);
		//digit2 = remainder % 10;
		//System.out.println(c);
	
		



	}

}
