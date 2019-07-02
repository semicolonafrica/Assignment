/**
 * 
 */
package exercise6_29;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author ken_granero
 *
 */
public class Coin {
	
	private enum Status {HEADS,TAILS}
	
	static SecureRandom randomNumber = new SecureRandom();
	static int coinFace = 1 + randomNumber.nextInt(2);
	
	public static void tossCoin() {
		
		Scanner insert = new Scanner(System.in);
		
		int value1 = 0;
		int value2 = 0;
		int count = 1;
		
		System.out.print("Enter T to Toss Coin: ");
		String letter = insert.nextLine();
		
		while(letter.contentEquals("T")) {
		
			coinFace = 1 + randomNumber.nextInt(2);
			
			switch(coinFace) {
				
				case 1:
					value1++;
					System.out.println(value1 + " "+ flipCoin());
					break;
					
				case 2:
					value2++;
					System.out.println(value2 + " "+ flipCoin());
					break;
					
			}
		
			System.out.print("Enter T to Toss Coin: ");
			letter = insert.nextLine();
			
			count++;
		
		}
		
		insert.close();
	}
	
	public static Status flipCoin() {
		
		Status gameStatus = null;
		
		if(coinFace == 1) {
			return Status.TAILS;
			
		}
		if(coinFace == 2) {
			gameStatus = Status.HEADS;
		}
		
		return gameStatus;
	}

}
