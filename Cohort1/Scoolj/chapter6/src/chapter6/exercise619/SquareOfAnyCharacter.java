/**
 * 
 */
package chapter6.exercise619;
import java.util.Scanner;
/**
 * @author Scoolj, Oluwajuwonlo
 *
 */
public class SquareOfAnyCharacter {

	public static char designCharacter() {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println(" Enter number of character: ");
		 int number = input.nextInt();
		 System.out.println(" Enter character: ");
		char character = input.next().charAt(0);
		
		char printCharacter = printingCharacter(number, character);
		
		return printCharacter;
		}
	
	public static char printingCharacter(int number, char character) {
		
		for (int counter = 1; counter <= number; counter++) {
			
			System.out.println();
			
			for (int counter2 =1; counter2 <= number; counter2++) {
				
				System.out.print(character);
				System.out.print(' ');
			}
		}
		
		return character;
	}
	
}
