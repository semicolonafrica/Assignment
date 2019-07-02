package chapter6Exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class Coin {
//	(Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
//	each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
//	the coin appears. Display the results. The program should call a separate method flip that takes no
//	arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
//	simulates coin tossing, each side of the coin should appear approximately half the time.]
	
	
	private enum Status {HEADS, TAILS};
//	
	private static final int HEADS =1;
	private static final int TAILS = 2;
	
	public static void flipCoin(){
		
	Scanner input = new Scanner(System.in);	
	System.out.println("Enter the number of times to toss coin");
	int number = input.nextInt();
	
//	System.out.println("1. Toss Coin");
//	int one = input.nextInt();
	
	Coin.tossCoin(number);
	input.close();
	
	}
		
	public static void tossCoin(int number ) {
		
		SecureRandom randomNumbers = new SecureRandom();
		
		int head =0;
		int tail =0;
		
		for(int counter=1; counter<=number; counter++) {
			int toss = 1+ randomNumbers.nextInt(2);
		
			switch(toss) {
		
			case HEADS:
				head++;
				break;        
			case TAILS:
				tail++;
				break;
			}
		}
		
		System.out.printf("Head: %d%nTail: %d%n", head++, tail++);	
		if (head++ > tail++) {
			System.out.print("WON!");	
		}
		else if(head++ == tail++){
			System.out.print("TIE!");
		}
		else {
			System.out.print("LOST!");		
		}
}
	
}
