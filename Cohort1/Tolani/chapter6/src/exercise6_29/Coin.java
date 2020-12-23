package exercise6_29;

import java.security.SecureRandom;
import java.util.Scanner;

public class Coin {
	private enum Status{HEADS,TAILS}
	
	static SecureRandom random = new SecureRandom();
	
	static int coinFace = random.nextInt(2);
	
	public static void tossCoin() {
		int count0 = 0;
		int count1 = 0;
		int counter = 1;
		Scanner insert = new Scanner(System.in);
		
		System.out.println("Enter T to toss coin or enter other letter to end it : ");
	
		char value =  insert.next().charAt(0);
	
		while(value == 'T') {
		
			coinFace = random.nextInt(2);
		
			switch(coinFace) {	
			
			case 0 :
				count0++;
				System.out.println(count0 +" " + flipCoin());
				break;
				
			case 1:
				count1++;
				System.out.println(count1 +" " + flipCoin());
				break;	
			}
			System.out.println("Enter T to toss coin: ");
			
			value = insert.next().charAt(0);
			counter++;
			
				}
		
		insert.close();		
		
	}
	
	public static Status flipCoin() {
		Status coinToss = null;
		
		if(coinFace == 0) {
			coinToss = Status.TAILS;
			
			
		}
		if(coinFace == 1) {
			coinToss = Status.HEADS;
		
		}
		
		return coinToss;
	}

}
