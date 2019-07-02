/**
 * 
 */
package chapter6.exercise6_23;


/**
 * @author Emmanuel Akinbode
 *
 */
public class Minimum {
	public static double calMinumum(double num1, double num2, double num3) {
		
		double minimum = Math.min(num1, Math.min(num2, num3));
		
		return minimum;
	}
	

}
