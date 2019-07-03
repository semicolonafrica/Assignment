/**
 * 
 */
package exercise6_32;

/**
 * @author ken_granero
 *
 */
public class Distance {
	
	public static double getHorizontal(double x1, double x2) {
		
		double value1 = x2 - x1;
		double value = Math.pow(value1,2);

		
		//System.out.println(value);
		
		return value;
	}
	
	public static double getVertical(double y1, double y2) {
		

		double value1 = y2 - y1;
		double value = Math.pow(value1, 2);
		
		//System.out.println(value);
		
		return value;
	}
	
	public static double calculateDistance(double x1, double x2, double y1, double y2) {
		
		double total = getHorizontal(x1, x2) + getVertical(y1, y2);
		
		double result = Math.sqrt(total);
		
		return result;
		
	}

}
