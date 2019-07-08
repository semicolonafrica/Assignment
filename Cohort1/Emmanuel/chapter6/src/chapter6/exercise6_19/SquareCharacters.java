/**
 * 
 */
package chapter6.exercise6_19;

/**
 * @author USER
 *
 */
public class SquareCharacters {
	
public static void printSquareCharacter(int number, char fill) {
		
		int counter = 1;
				
		for(counter  = 1; counter <= number; counter++) {
			for(int i = 1; i <= number; i++) {
				System.out.print(fill);
			}
			System.out.println();
		}
		
		
	}

}
