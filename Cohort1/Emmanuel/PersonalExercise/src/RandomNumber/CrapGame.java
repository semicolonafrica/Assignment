/**
 * 
 */
package RandomNumber;

import java.security.SecureRandom;

/**
 * @author Emmanuel Akinbode
 *
 */
public class CrapGame {

	/**
	 * @param args
	 */
	public static int  generateNum() {
	 	// TODO Auto-generated method stub
		
		SecureRandom random = new SecureRandom();
		
		int x = 1 + random.nextInt(6);
		int y = 1 + random.nextInt(6);
		System.out.println(y);
		System.out.println(x);
		int sum = x + y;
		
		return sum;
		
	}	
	public static void sumDice() {
		int counter = 0;
		int sum = generateNum();
		
			
			if(sum == 7 || sum==11) {
			System.out.println(sum);
			System.out.println("You won");
			
		}
		if(sum==2 || sum==3 || sum==12) {
			
			System.out.println(sum);
			System.out.println("Craps, you loose");
		
		}
		if(sum==4 || sum==5 || sum==6 || sum==8 || sum==9 || sum==10) {
			
			System.out.println(sum);
			System.out.println("Points; continue");
			
			System.out.println();
			int myPoint = sum;
			
			while(myPoint != 7) {
				
				myPoint = generateNum();
				if(sum == myPoint) {
					System.out.println(sum);
					System.out.println("You win");
					//break;
				}
				else if(sum == 7) {
					System.out.println(sum);
					System.out.println("You loose");
					//break;
				}
			}
		}
			
	
	}
}
		
	

