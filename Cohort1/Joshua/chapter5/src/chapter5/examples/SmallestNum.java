/**
 * 
 */
package chapter5.examples;

/** Assignment from with (exercise 5.11)
 * @author user
 *
 */
import java.util.Scanner;
public class SmallestNum {
 

	
	public void calcSmallestNum() {
		Scanner input = new Scanner(System.in);
	
		int counter = 1;
		int firstInput = 0;
		int result = 0;
		System.out.println("Enter Number of loop: ");
		int loop = input.nextInt();
		
		while(counter <= loop) {
			System.out.println("Enter Number Here: ");
			firstInput = input.nextInt();
			
			if(firstInput < result)
				result = firstInput;
				
			counter++;
		}
		
		System.out.printf("%nSmallest of the %d numbers entered is %d%n" , counter, result);
		input.close();
	}
	
}
