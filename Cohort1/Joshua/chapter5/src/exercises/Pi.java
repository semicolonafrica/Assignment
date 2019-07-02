/**
 * 
 */
package exercises;

/**Exercise 5.20
 * @author user
 *
 */
import java.util.Scanner;
public class Pi {
	Scanner input = new Scanner(System.in);

	int denominator = 0;
	int numerator = 4;
	double pi = 0 ;
	double counter = 1;

	
	
	public void calcPi() {
		System.out.println("\t Numbers" + "\t Value of pi");
		
		for(int i = 1; i <= 20; i++) {
		pi = - pi + numerator / counter;
		counter = counter +2  ;
		System.out.println(" \t" + i + "\t \t" + pi);
		
			
			
			}//end of for loop	
		
	}// end method calcPi
}//end of class
