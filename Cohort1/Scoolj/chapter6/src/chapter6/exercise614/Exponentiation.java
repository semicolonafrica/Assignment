/**
 * 
 */
package chapter6.exercise614;
import java.util.Scanner;
/** 
 * Scoolj, Oluwajuwonlo
 *
 */
public class Exponentiation {

	public static int calculateExponent() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Base number");
		int base = input.nextInt();
		System.out.println(" Enter Exponent number");
		int exponent = input.nextInt();
		
		int exponential =1;
		for (int counter =1; counter <= exponent; counter++) {
					
 
			exponential *=base;
		}
		
		
		System.out.println("Base:  "+ base + "  Exponent :  "+ exponent + " \t" + exponential );
		
		return exponential;
		
		
		
	}
}
