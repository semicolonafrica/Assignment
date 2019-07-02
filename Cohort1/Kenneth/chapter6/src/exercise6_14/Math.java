/**
 * 
 */
package exercise6_14;

/**
 * @author ken_granero
 *
 */
public class Math {
	
	public static int getBase(int base, int exponent) {
		int value = 1;
		
		for(int i = 1; i<= exponent; i++ ) {
			value = value * base;
			
		
		}
		return value;
	}

}
