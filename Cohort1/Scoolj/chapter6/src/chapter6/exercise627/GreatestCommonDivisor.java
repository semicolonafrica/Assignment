/**
 * 
 */
package chapter6.exercise627;
import java.util.Scanner;
/**
 * @author Scoolj, Oluwajuwonlo
 *
 */
public class GreatestCommonDivisor {
	
	public static int findGreatestCommonDivisor() {
		Scanner input = new Scanner (System.in);
	 	System.out.println(" Enter first Number");
		int number1 = input.nextInt();
		System.out.println(" Enter Second Number");
		int number2 = input.nextInt();
		int GreatCommonDivisorNumber = calculateGreatestCommonDivisor(number1, number2);
		input.close();
		return GreatCommonDivisorNumber;		
	}
	
	public static int calculateGreatestCommonDivisor(int numberA, int numberB) {		
		int counter= 0;
		int intStore = 0;
		
		for (counter =1; counter <= numberB; counter++) {
			// this finding remainder of the two inputs using counter to divide inputs
			if (numberA % counter == 0 && numberB % counter ==0) {
				
				intStore = counter;
			} 
			}
		System.out.println(intStore);
		return counter;
	}

}
