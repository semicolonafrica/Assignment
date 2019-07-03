package chapter6;

import java.security.SecureRandom;

public class CoinTossing {
	
	private enum TossCoin{ HEADS, TAILS };
	
	public static void generate(int side) {
		
		SecureRandom randomNumbers = new SecureRandom();
		
		int tossing = 1;
		int heads = 0;
		int tails = 0;
		
		for(int i = 1; i <= side; i++) {
			
			tossing = randomNumbers.nextInt(2);
			
			
			if(tossing == 0) {
				heads++;
			} else {
				tails++;
			}
			
			
			
		}
		System.out.printf("HEADS:%d TAILS: %d. \nThe result of the toss: %s",heads,tails, flip());
		
		
	}
	
	public static TossCoin flip() {
		
		SecureRandom randomNumbers = new SecureRandom();
		int roll = randomNumbers.nextInt(2);
		
		TossCoin read;
		
		if(roll == 0) {
			read = TossCoin.HEADS;
		} else {
			read = TossCoin.TAILS;
		}
		
		return read;
		
	}


	
	
	
	
}
