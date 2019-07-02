/**
 * 
 */
package chapter6.exercise623;
import java.util.Scanner;
/**
 * @author Scoolj, Oluwajuwonlo
 * SCV1028
 */
public class Minimum {
	
	public static double findMinimum() {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter numbers with space to separate them: ");
		
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double findMinNumber = calaculateMininum(number1, number2, number3);
		
			return findMinNumber;	
	}

	public static double calaculateMininum(double number1, double number2, double number3) {
		
		// this is use to find the minimum value of input from user.
		
		double findMinNumber = Math.min(number1, Math.min(number2, number3));
		System.out.println("The Mininum number is :"+ findMinNumber);
		
		return findMinNumber;
	}
}
