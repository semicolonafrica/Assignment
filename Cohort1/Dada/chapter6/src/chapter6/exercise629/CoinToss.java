package chapter6.exercise629;

import java.util.Scanner;
import java.security.SecureRandom;
	
public class CoinToss {
	
	private static Scanner input = new Scanner(System.in);
	private static SecureRandom randomNumber = new SecureRandom();
	private enum Side{HEAD, TAIL};
	
	public static void flipCoin() {
		int head = 0;
		int tail = 0;
		
		System.out.print("Enter number of times to flip coin: ");
		int flipNumber = input.nextInt();
		
		while(flipNumber >0) {
			for(int x = 0; x <= flipNumber;  x++) {
				
				switch(flip()) {
				case HEAD:
					head++;
					break;
				
				case TAIL:
					tail++;
					break;
										
								
				}
			
			}
			System.out.println("HEAD is: " + head + " TAIL is: " + tail);
			flipNumber--;
		}
		System.out.println("Your number of flip is: " + (head + tail));
	}
	
	public static Side flip() {
		
		int coin = 1 + randomNumber.nextInt(2);
		
		if(coin == 1) {
			return Side.HEAD;
					
		}
		else
			return Side.TAIL;
		
		
	}
	

}
