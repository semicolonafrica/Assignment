/**
 * 
 */
package exercise6_10;

import java.util.Scanner;

/**
 * @author ken_granero
 *
 */


public class RoundingNumbers2 {
	
	
	public static double roundToTenths(double x) {
		double i = Math.floor(x * 10 + 0.5)/ 10;
		return i;
	}
	
	public static double roundToHundredths(double x) {
		double j = Math.floor(x * 100 + 0.5)/ 100;
		return j;
	}
	
	public static double roundToThousandths(double x) {
		double k = Math.floor(x * 1000 + 0.5)/ 1000;
		return k;
	}
	
	
	
	public static void roundToInteger() {
		Scanner insert = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		
		System.out.print("Enter value or -1 to end: ");
		x = insert.nextDouble();
		
		while(x != -1) {
		y = Math.floor(x * 1 + 0.5);
		
		
		System.out.println("The original number is : " + x);
		System.out.println("The rounded number is Integer : " + y);
		System.out.println("The rounded number is Tenths : " +roundToTenths(x));
		System.out.println("The rounded number is Hundredths : " +roundToHundredths(x));
		System.out.println("The rounded number is Thousandths : " +roundToThousandths(x));
		
		
		System.out.println();
		
		System.out.print("Enter value x or -1 to end: ");
		x = insert.nextDouble();
		
		
		}
		insert.close();
	}
	
	

}
