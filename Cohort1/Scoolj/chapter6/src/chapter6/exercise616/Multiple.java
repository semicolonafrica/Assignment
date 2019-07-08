/**
 * 
 */
package chapter6.exercise616;
import java.util.Scanner;
/**
 * @author Scoolj, Oluwajuwonlo
 * SCV1028
 *
 */
public class Multiple {
		static enum IsMultipleDecision {TRUE, FALSE};
		
	public static int isMultiple() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		
		int firstNumber = input.nextInt();
		
		System.out.println("Enter Second Number:");
		
		int secondNumber = input.nextInt();
		
		int numberMultiple = calculateMultiple(firstNumber, secondNumber);
		
		
		return numberMultiple;
		
	}
	
	public static int calculateMultiple(int firstNumber, int secondNumber) {
		
		 IsMultipleDecision status;
		  
		 
		 if (secondNumber % firstNumber == 0) {
		 status = IsMultipleDecision.TRUE;
		 System.out.println("is it a multiple? " + status + ". It is a multiple of  " + firstNumber);
		 }
		 else {
		 status = IsMultipleDecision.FALSE;
		 System.out.println("is it a multiple? " + status + ". It is not a multiple of  " + firstNumber);
		
			 
		 }
			 
			 

		return firstNumber;
		
	}
	
	
	
}
