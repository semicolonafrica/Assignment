/**
 * 
 */
package chapter6.exercise617;
import java.util.Scanner;
/**
 * @author Scoolj, Oluwajuwonlo
 *
 */
public class EvenOdd {

	static enum Status { TRUE, FALSE};
	
	public static int determineNumber() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
			number = evenOddNumber(number);
		
		return number;
	}
	
	public static int evenOddNumber(int number) {
		
		Status decision;
		
		if (number %2 == 0) {
			decision = Status.TRUE;
			
			System.out.println("This is an Even number:  "+ decision );
			
		}
		else {
			decision = Status.FALSE;
			System.out.println("This is an Odd number:  "+ decision );
		}
		
		return number;
	}
	
}
