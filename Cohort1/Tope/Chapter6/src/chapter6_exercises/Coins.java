package chapter6_exercises;

import java.security.SecureRandom;
import java.util.Scanner;

//Program to Toss a coin
//Exercise 6.29
//Program written by Oyemade Temitope
//22nd of June 2019

public class Coins {
	
	private enum CoinStatus{HEAD, TAIL};
	
	
	
	public static CoinStatus flip() {
		
		CoinStatus myStatus = CoinStatus.HEAD;
		SecureRandom random = new SecureRandom();
		int headorTail = random.nextInt(2);
		
		if(headorTail == 0)
			myStatus = CoinStatus.TAIL;
		
		return myStatus;
	}
	
	public void tossCoin() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Press 1 to toss coin");
		int number = input.nextInt();
		if(number != 1)
			throw new IllegalArgumentException("Press 1 to start");
		
		System.out.println("Enter number of times you want to Toss");
		int numberOfTimes = input.nextInt();
		int counter = 1;
		CoinStatus status;
		int headCounter = 0;
		int tailCounter =0;
		
		while(counter <= numberOfTimes) {
			
			status = flip();
			
			if(status == CoinStatus.HEAD)
				headCounter++;
			
			if(status == CoinStatus.TAIL)
				tailCounter++;
			
			counter++;
		}
		
		System.out.printf("Head = %d %n" +"Tail = %d " ,
				headCounter, tailCounter);
		input.close();
	}
	
}
