/**
 * 
 */
package chapter6.exercise6_18;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Square {
	
	public static void printSquare(int number) {
		
		int counter = 1;
				
		for(counter  = 1; counter <= number; counter++) {
			for(int i = 1; i <= number; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
