/**
 * 
 */
package exercise6_23;

/**
 * @author ken_granero
 *
 */
public class Minimum {
	
	public static double checkMinimum(double num1, double num2, double num3) {
		
		double result = Math.min(num1,(Math.min(num2, num3)));
		
		return result;
	}

}
