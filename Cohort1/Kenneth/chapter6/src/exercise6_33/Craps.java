package exercise6_33;

import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {
	
	
	private enum Status{WON, LOST, CONTINUE}
	
	private static final int COBRA = 7;
	private static final int PYTHON = 11;
	private static final int EAGLE = 2;
	private static final int KITE = 3;
	private static final int DRAGON = 12;
	
	
	public static void checkWager() {
		int bankBalance = 1000;
		
		
		Scanner insert = new Scanner(System.in);
		
		System.out.print("Enter wager: ");
		int wager = insert.nextInt();
		while(wager !=-1) {
			
		       while(wager > bankBalance) {
					
					System.out.print("Enter wager: ");
					wager = insert.nextInt();
					
				}
				if(wager <= bankBalance) {
					if(checkOutcome()== Status.WON) {
						bankBalance += wager;
						System.out.println(bankBalance);
					}else if(checkOutcome() == Status.LOST) {
						bankBalance -= wager;
						System.out.println(bankBalance);
					}
					
				}
				if(bankBalance == 0) {
					System.out.println("Sorry, you busted");
				}
				
		System.out.print("Enter wager: ");
		wager = insert.nextInt();
		}
		insert.close();
		
	}
	
	
	
	
	public static int rollDice() {
		
		SecureRandom number = new SecureRandom();
		
		int face1 = 1 + number.nextInt(6);
		int face2 = 1 + number.nextInt(6);
		
		int sum = face1 + face2;
		
		//System.out.print("Player rolled " +face1+ "+" +face2);
		
		return sum;
		
	}
	
	public static Status checkOutcome() {
		
		int point = 0;
		Status gameStatus;
		int sumDice = rollDice();
		
		switch(sumDice) {
		
			case COBRA:
			case PYTHON:
				gameStatus = Status.WON;
				break;
				
			case EAGLE:
			case KITE:
			case DRAGON:
				gameStatus = Status.LOST;
				break;
				
			default:
				gameStatus = Status.CONTINUE;
				
				System.out.println(sumDice);
				break;
					
		}
		
		while(gameStatus== Status.CONTINUE) {
			point = rollDice();
			
			if(point == COBRA) {
				gameStatus = Status.LOST;
				
			}
			else if(point == sumDice) {
				gameStatus = Status.WON;
			}
			
		}
		
		if(gameStatus == gameStatus.WON) {
			
			
			System.out.println(sumDice);
			System.out.println("Player Won!!");
			
		}
		else {
			System.out.println(sumDice);
			System.out.println("Player Lost. Try Again!!");
		}
		return gameStatus;
	}


}
