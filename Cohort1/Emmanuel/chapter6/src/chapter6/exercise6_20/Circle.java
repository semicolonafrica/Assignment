/**
 * 
 */
package chapter6.exercise6_20;

/**
 * @author USER
 *
 */
public class Circle {
	
	public static double circleArea(double r) {
		
		double square = 1;
		for(int i =1; i <=2; i++) {
			square*=r;
		}
		
		double area = 3.712 * square;
		
		return area;
	}
	

}
