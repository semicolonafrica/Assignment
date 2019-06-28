/**
 * 
 */
package chapter6.exercise6_32;

import chapter6.MathUtility.AyoMath;

/**
 * @author Emmanuel Akinbode
 *
 */
public class DistanceBetweenTwoPoints {
	
	public static void calDistance(double x1, double y1, double x2, double y2) {
		
		double xValue = x2 - x1;
		double yValue = y2 -y1;
		double both = ((xValue*xValue) + (yValue*yValue));
	   	

        both = Math.sqrt(both);
    	System.out.printf("%.2f",both);	
        }
       
	
}
		
		




