package chapter6.exercises;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author LEMON
 *
 */
public class Crap {
	private static final SecureRandom rand = new SecureRandom();

	private enum Status {
		CONTINUE, WON, LOST
	};

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	static int bankBalance = 1000;
	static int wager;

	public static void balance() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Wager:");
		wager = input.nextInt();

		if (wager <= bankBalance && wager  >0) {
			crapGame();
		} 
		else {
			System.out.println("Insufficient Balance");
			balance();
		}
	}

	public static void crapGame() {
		int myPoint = 0;
		Status gameStatus;
		// balance();
		int sumOfDice = rollDice();

		switch (sumOfDice) {
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;

			break;
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			System.out.printf("Point is %d%n", myPoint);
			break;
		}

		while (gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();

			if (sumOfDice == myPoint) {
				gameStatus = Status.WON;
			} 
			else if (sumOfDice == SEVEN) {
				gameStatus = Status.LOST;
			}
		}
		if (gameStatus == Status.WON) {
			int counter=0;
			System.out.println("Player wins");
			bankBalance = bankBalance + wager;
			System.out.println("Well done balance is " + bankBalance);
			counter++;
			if(counter == 10) {
				System.out.println("You're up big. Now's the time to cash in your chips!");
			}
			balance();
		} 
		else {
			System.out.println("Player loses");
			bankBalance = bankBalance - wager;
			System.out.println("Balance is " + bankBalance);
			if (bankBalance == 0 ) {
				System.out.println("Sorry. You are busted!");
			}
			else {
			chatter();
			balance();
			}
			
		}
	}

	public static void chatter() {
		int chat = 1 + rand.nextInt(2);

		switch (chat) {
		case 1:
			System.out.println("Aw c'mon, take a chance!");
			break;
		case 2:
			System.out.println("Oh, you're going for broke, huh?");
			break;
		}
	}

	public static int rollDice() {
		int die1 = 1 + rand.nextInt(6);
		int die2 = 1 + rand.nextInt(6);

		int sum = die1 + die2;

		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

		return sum;
	}

	public static void main(String[] args) {
		balance();
	}

}
