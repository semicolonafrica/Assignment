/**
 * 
 */
package chapter6.exercise6_21;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Digits {
	
	public static int calIntQuotient(int a, int b) {
		
		int quotient = a/b;
		
		return quotient;
	}
	
	public static int calQuotientModulus(int a, int b) {
		
		int quotient = a % b;
		
		return quotient;
	}
	
	public static String  displayDigits(int number) {
		
		int remainder = 0;
		String space = "";
		
		while(number>0) {
			remainder = calQuotientModulus(number, 10);
			space = remainder+ " "+space;
			number = calIntQuotient(number, 10);	
			
			
			
		}
		
		return space;
		
	}

}
