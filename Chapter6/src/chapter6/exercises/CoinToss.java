package chapter6.exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinToss {
	
	private enum Status{ HEAD, TAIL} 			
			static int head = 0;
			static int tail = 0;
				
	
	public static void tossCoin(int numb) {	
		SecureRandom randomNumbers = new SecureRandom();		
		
			for(int i=1; i<=numb; i++) {
				int coinToss = randomNumbers.nextInt(2);
				
				if (coinToss == 0) {
					head += 1;
				}
				else {
					tail += 1;
				}				
			}
			System.out.printf("%d %d", head,tail);
	}		
		public static void main(String[] args) {
//				CoinToss lem = new CoinToss();
			Scanner ops = new Scanner(System.in);
			
			System.out.println("Enter number of times to toss coin: ");
			int value = ops.nextInt();
			
				tossCoin(value);
		}
}