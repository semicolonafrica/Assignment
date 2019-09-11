/**
 * 
 */
package chapter6.exercise6_16;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Multiple {
	
	public static void checkMultiple(int num1, int num2) {
		
//		int num1 =0;
//		int num2 =0;
		if(num1 % num2 == 0) {
			System.out.println(num2 + " is a multiple of " + num1);
		}
		else {
			System.out.println(num2 + " is not a multiple of " + num1);
		}
		
			
	}
}
	


