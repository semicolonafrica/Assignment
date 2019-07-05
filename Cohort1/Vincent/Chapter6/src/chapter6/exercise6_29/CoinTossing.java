package chapter6.exercise6_29;

import java.security.SecureRandom;

//Write an application that simulates coin tossing. Let the program toss a coin
//each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
//the coin appears. Display the results. The program should call a separate method flip that takes no
//arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
//simulates coin tossing, each side of the coin should appear approximately half the time.]

import java.util.Random;

public class CoinTossing {
	
	static SecureRandom random = new SecureRandom();
	private enum Coin{HEAD, TAIL}
		
		public static void tossCOIN(int tossvalue)  {
			

			int head = 0;
			int tail = 0;
			int value;
		for(int count = 1; count <= 2; count++) {
			value = random.nextInt(2);
			
			if (value == 0) {
				tail++;
		}
			if (value == 1) {
				head++;	
		}
		
		}
		System.out.println("Head: " + head + "\n" + "Tails: " + tail);
		System.out.println("Coin lands on: "+flip());
	}

	public static Coin flip() {
		int value;
		Coin flipcoin = Coin.TAIL;
		value = random.nextInt(3);
		
		if (value == 0) {
			flipcoin = Coin.TAIL;
					
		}
		if(value ==1) {
			flipcoin = Coin.HEAD;
		}
		return flipcoin;
	}
}
