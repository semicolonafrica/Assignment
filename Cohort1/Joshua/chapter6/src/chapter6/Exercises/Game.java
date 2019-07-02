/**
 * 
 */
package chapter6.Exercises;

/**
 * @author user
 *
 */


import java.security.SecureRandom;

public class Game {

	
	public static int generateNum() {
		
		SecureRandom random = new SecureRandom();
		
		int x = 1 + random.nextInt(6);
		int y = 1 + random.nextInt(6);
		
		int sum = x + y;
		 return sum;
		 
	}	 
		public static void sumDice() {
			int sum = generateNum();
			
			
		if(sum == 7 || sum == 11)
			System.out.printf("%d you win", sum);
		
		if(sum == 2 || sum == 3 || sum == 12)
			System.out.printf("%d Craps!, You lose", sum);
		
		if(sum == 4 || sum == 5 || sum == 6 || sum == 9 || sum == 10) {
			
			
			System.out.printf("%d points; continue", sum);
			int myPoint = sum;
			
			while(myPoint != 7) {
				myPoint = generateNum();
				if(sum ==myPoint) {
					System.out.printf("%s%d You win " , sum);
				}
				else if(sum == 7) {
					System.out.printf(" %s%d You loose" , sum);
					break;
				}
			}
		}
	}
}


