/**
 * 
 */
package chapter6.exercise625;
import java.util.Scanner;
/**
 * @author Scoolj, Oluwajuwonlo
 *
 */
public class PrimeNumber {

	public static int findPrimeNumber() {
		Scanner  input = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = input.nextInt();
		int  primeNumber = calculatePrimeNumber(number);
				
				
				return primeNumber;
	}
	
	public static int calculatePrimeNumber(int number) {
		int numberSquare =0;
		String primeNumber = " ";
	
	for (int counter= 1; counter <= number; counter++) {
		
		if (counter % 2 != 0 ) {
			
			numberSquare = (int) Math.sqrt(counter);
			
			if (numberSquare * numberSquare != counter) {
				

				primeNumber += " "+  counter ;
 
				
				}
	 
		
		}
	}
		System.out.println(primeNumber);
			
			
			return numberSquare;
	}
	
	
}