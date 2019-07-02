/**
 * 
 */
package chapter6.exercise624;
import java.util.Scanner;
/**
 * @author Scoolj, Oluwajuwonlo
 * SCV1028
 */
public class PerfectNumber {
	
	public static int findPerfectNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int number = input.nextInt();
		
		 String perfectNumber = calculatePerfectNumber(number);
		
		return number;
	}
	public static String calculatePerfectNumber(int number) {
		String store = " ";
		
		for (int counter = 1; counter < number; counter++) {
			 
				if (number != counter){
					
						if ( number % counter ==0) {
							
							  store += " " + counter + " + ";
							  
//							  continue;
						}
					
				
				}
				
				else {
					
					System.out.println("This  is not a perfect Number");
					
					break;
				}
				
		}	
		System.out.println(store);
		return store;
	}
	

}
