package exercise6._23;
/* A program that  creates a method (minimum3)
 * that finds the smallest number
 */
public class MinimumNumber {
	
	public static double minimum3(double num1, double num2, double num3) {
		
		double minimum = num1;
		
		if(minimum > num2) {
			minimum = num2;
		}else 
			if(minimum > num3) {
				minimum = num3;
			}
		return minimum;
	}

}
