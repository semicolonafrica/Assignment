package chapter6;

import java.security.SecureRandom;

public class CoinToss {
	
	private enum Status{ HEAD,TAIL};
	
	
	
	public static void tossCoin() {
		SecureRandom randomNumbers = new SecureRandom();
		int head =0;
		int tail=0;
		for(int toss =1;toss<=100;toss++) {
			
			int side=1+ randomNumbers.nextInt(2);
			
			switch(side)
			{
			case 1:
				++head;
				break;
			case 2:
				++tail;
				break;
			}
			
		}
		System.out.println(head); 
		System.out.println(tail); 
		System.out.println(flipCoin());
	}
	
	public static Status flipCoin() {
		SecureRandom randomNumbers = new SecureRandom();

		Status gameStatus;
		int roll = 1 + randomNumbers.nextInt(2);
		if(roll == 1) {
			gameStatus = Status.HEAD;
		} else {
			gameStatus = Status.TAIL;
		}
		return gameStatus;
		//switch(sumOfCoin)
	}
		
		public static void main(String[] args) {
			tossCoin();
		}

}
