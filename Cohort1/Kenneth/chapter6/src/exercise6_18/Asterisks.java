/**
 * 
 */
package exercise6_18;

import java.util.Scanner;

/**
 * @author ken_granero
 *
 */
public class Asterisks {

	
	
	public static int printAsterisks() {
		
		Scanner insert = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = insert.nextInt();
		
		for(int j = 1; j <= num; j++) {
			
			for (int i = 1; i <= num; i++) {
				
				System.out.print("*");
			}
				
			System.out.println();
		}
		
		insert.close();
		return 0;
	}
}
