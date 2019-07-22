package exercise6_29;

import java.security.SecureRandom;
import java.util.Scanner;

public class TossingCoin {
	
	private static Scanner input = new Scanner(System.in);
	private static SecureRandom randomNumber = new SecureRandom();
	
	private enum Side{HEAD, TAIL};
	static Side coinSide;
	private static int coin;
	
	public static void flip() {
		int head = 0;	int tail = 0;

		System.out.println("Enter number of times to toss coin: ");
		int tossCoin = input.nextInt();
		while (tossCoin > 0) {
					
			switch (flipCoin()) {
			case HEAD:
				head++;
				System.out.println("You rolled head");
				System.out.println("head = " + head);
				break;
			case TAIL:
				tail++;
				System.out.println("You rolled tail");
				System.out.println("You tail = " + tail);
				break;
			}

				tossCoin--;
		}
		
		
	}
	public static Side flipCoin() {
		coin = 1 + randomNumber.nextInt(2);
		if (coin == 1) {
			return Side.HEAD;
		}
		else return Side.TAIL;
	}
}