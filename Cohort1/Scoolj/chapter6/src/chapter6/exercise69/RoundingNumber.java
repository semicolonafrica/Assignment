/**
 * 
 */
package chapter6.exercise69;
import java.util.Scanner;
/**
 * Scoolj, Oluwajuwonlo
 * SCV1028
 *
 */
public class RoundingNumber {

	static Scanner input = new Scanner(System.in);
	
	static double nearestInteger= 0;
	
	public static double findNearestInteger() {
		System.out.println ("Please Enter Number");
		double number = input.nextDouble();
		// this is use to identify input that will be round up or down
		double number2 = number%1;
		 number2*=10;
		
		// this make the decision based on input
		if (number2 >=5.0) {
			
			nearestInteger =  Math.ceil(number);
			System.out.println (nearestInteger);
			
		}
		
		if (number2 <5 ){
			
			nearestInteger = Math.floor(number);
			System.out.println (nearestInteger);
		}
		
	
		
		return number;
	 
}
}