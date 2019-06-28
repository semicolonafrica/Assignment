/**
 * 
 */
package chapter6.exercise6_29;

import java.security.SecureRandom;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Coin {
	
	static SecureRandom randomNumbers = new SecureRandom();
	
	private static enum Coins {HEAD, TAIL, DEFAULT }
	
	
	public static void tossCoin(int num) {
		int head = 0;
		int tail = 0;
		
	
	
	for(int i = 1; i <= num; i++){
		
		int	toss = randomNumbers.nextInt(2);
		
		if(toss == 1) {
			head++;
		}else if(toss == 0) {
			tail++;
		}
		
	}
	System.out.println("The number of toss is: "+"Head: " +head+ " Tail: "+ tail);
	System.out.println("The side of coin fliped is: " + flip());	
		
	}
	
	public static Coins flip() {
	
		
		Coins flipCoin = Coins.DEFAULT;
		int random = randomNumbers.nextInt(2);

		
		if(random == 1) {
			flipCoin = Coins.HEAD;
		}
		else if(random == 0) {
			flipCoin = Coins.TAIL;
		}
		
		
		return flipCoin;
	}
	
}
