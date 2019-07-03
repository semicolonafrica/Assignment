/**
 * 
 */
package chapter6.exercise6_14;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Math {
	
	public static int IntegerPower(int x, int y) {
		
	
		int power = 1;
		for(int i =1; i <=y; i++) {
			power *= x;
			
			 
		}	
		return power;
		
	}
	public static int getIntegerPower() {
					
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter the base number: ");
		int x = input.nextInt();
		System.out.println("Enter the exponent number: ");
		int y = input.nextInt();
		
		int output = IntegerPower(x, y);
		
		
		return output;
	}
	

}
