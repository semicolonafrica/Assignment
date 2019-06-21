/**
 * 
 */
package exercises;

/**Exercise 5.15
 * @author Group 2(Me and Christian)
 *
 */
public class Patterns {

	
	public static void main(String[] args) {
		int counter = 10;
		
		for( counter = 1; counter <= 10; counter++) {
			System.out.println("");
			for(int side = 1; side <= counter; side++)
				System.out.print("*");
			//System.out.print("");
	  }
			System.out.println();
		for(int i = 10; i >=1; i--) {
			System.out.println("");
			for(int reverse = 1; reverse <=i; reverse++) {
				System.out.print("*");
			}
		}
		
		System.out.println();
		for(int i = 10; i >=1; i--) {
			System.out.println("");
			for(int reverse = 1; reverse <=i; reverse++) {
				System.out.print("*");
			}
		}
		
		
		System.out.println();
		for( counter = 1; counter <= 10; counter++) {
			System.out.println("");
			for(int side = 1; side <= counter; side++)
				System.out.print("*");
			
	  }
   }
	
	
}