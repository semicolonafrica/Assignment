package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGame {

	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status { WIN, LOSE, CONTINUE };

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int BOX_CARS = 12;
	private static final int YO_LEVEN = 11;
	
	public static void rollGame() {
		int bankBalance = 1000;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter wager: ");
		int wager = input.nextInt();
		
		while(wager > bankBalance) {
			System.out.print("Re-enter the wager: ");
			wager = input.nextInt();
			if(wager <= bankBalance) {
				break;
			}
		}
		
		int myPoint = 0;

		Status gameStatus;
		int sumOfDice = rollDice();
		
		switch(sumOfDice) {

			case SEVEN:
			case YO_LEVEN:
				gameStatus = Status.WIN;
				break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOSE;
				break;
			default:
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice;
				System.out.printf("Point is %d%n", myPoint);	
				break;
		}

		while(gameStatus == Status.CONTINUE) {
			System.out.println();
			sumOfDice = rollDice();
			System.out.println();
			chatter();
			if(sumOfDice == myPoint) {
				gameStatus = Status.WIN;
			} else if(sumOfDice == SEVEN) {
				gameStatus = Status.LOSE;
			}
			
		}
		
		if(gameStatus == Status.WIN) {
			bankBalance += wager;
			System.out.println("Player wins!");
			System.out.println("\nThe new bank balance \nafter WINNING is " + bankBalance);
		}
		else if(gameStatus == Status.LOSE){
			bankBalance -= wager;
			System.out.print("\nPlayer loses!");
			System.out.println("\nThe new bank balance \nafter LOSING is " + bankBalance);
		}
		
		if(bankBalance == 0) {
			System.out.print("Sorry, You busted");
		}
		
	}
	
	public static int rollDice() {

		int dice1 = 1 + randomNumbers.nextInt(6);
		int dice2 = 1 + randomNumbers.nextInt(6);
		
		int sum  = dice1 + dice2;
		System.out.printf("%s %d + %d = %d%n",
				"Player rolls", dice1,dice2,sum);
		
		return sum;
		
	}
	public static int wager() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter wager: ");
		int wager = input.nextInt();
		
		input.close();
		return wager;
	}
	
	public static void chatter() {		
		int random = randomNumbers.nextInt(3);
		
		switch(random) {
			case 0:
				System.out.print("Oh, you're going for broke, huh.");
				break;
			case 1:
				System.out.print("Aw c'mon, take a chance.");
				break;
			case 2:
				System.out.print("You're up big. Now it is the time to cash in your chips.");
				break;
		}
		
	}
}
