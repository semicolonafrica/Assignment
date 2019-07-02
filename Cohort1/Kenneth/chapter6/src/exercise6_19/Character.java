/**
 * 
 */
package exercise6_19;

import java.util.Scanner;

/**
 * @author ken_granero
 *
 */
public class Character {
	
	public static int printCharacter() {
	
	Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Character: ");
		char fill = input.next().charAt(0);
		
		System.out.print("Enter number of Character: ");
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = 1; j <= num; j++) {
				System.out.print(fill);
			}
			
			System.out.println();
		}
		
		input.close();
		return 0;
	}

}
