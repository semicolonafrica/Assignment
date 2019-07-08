package chapter6Exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGame2 {
	
//	(Craps Game Modification) Modify the craps program of Fig. 6.8 to allow wagering. Initialize
//	variable bankBalance to 1000 dollars. Prompt the player to enter a wager. Check that wager
//	is less than or equal to bankBalance, and if it’s not, have the user reenter wager until a valid wager
//	is entered. Then, run one game of craps. If the player wins, increase bankBalance by wager and display
//	the new bankBalance. If the player loses, decrease bankBalance by wager, display the new bank-
//	Balance, check whether bankBalance has become zero and, if so, display the message "Sorry. You
//	busted!" As the game progresses, display various messages to create some “chatter,” such as "Oh,
//	you're going for broke, huh?" or "Aw c'mon, take a chance!" or "You're up big. Now's the time
//	to cash in your chips!". Implement the “chatter” as a separate method that randomly chooses the
//	string to display.

	// create secure random number generator for use in method rollDice
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status { CONTINUE, WON, LOST };
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	Status gameStatus; // can contain CONTINUE, WON or LOST
	
	int sumOfDice = rollDice(); // first roll of the dice
	
		switch (sumeOfDice) {
		
		case SEVEN: // win with 7 on first roll
		case YO_LEVEN: // win with 11 on first roll
			gameStatus = Status.WON;
		case SNAKE_EYES: // lose with 2 on first roll
		case TREY: // lose with 3 on first roll
		case BOX_CARS: // lose with 12 on first roll
			gameStatus = Status.LOST;
		default: // did not win or lose, so remember point
			gameStatus = Status.CONTINUE; // game is not over
			myPoint = sumOfDice; // remember the point
			gameStatus == Status.CONTINUE
					sumOfDice = rollDice(); // roll dice
		}
	// display won or lost message
	if ( )
	System.out.println("Player wins");
	else
	System.out.println("Player loses");
	}
	
	// roll dice, calculate sum and display results
	
	{
	// pick random die values
	int die1 = 1 + randomNumbers.nextInt(6); // first die roll
	int die2 = 1 + randomNumbers.nextInt(6); // second die roll
	int sum = die1 + die2; // sum of die values
	// display results of this roll
	System.out.printf("Player rolled %d + %d = %d%n",
	die1, die2, sum);
	
	}
	} // end class Craps
	public static void wage() {
		
		Scanner input = new Scanner(System.in);
		int bankBalance = 1000;
		System.out.println("Enter a wager");
		int wager = input.nextInt();
		
		if (wager <= bankBalance) {
			
		}
		else {
			System.out.println("Enter a wager");
			wager.craps
		}
		if (palyer wins) {
			bankBalance +=wager;
			System.out.println(bankBalance);
		}
		else (player loses) {
			bankBalance -=wager;
			System.out.println(bankBalance);
			System.out.println("oh, you're going for broke, huh?");
		}
		if (balance <=0) {
			System.out.println(Sorry. You busted!);
		}
		
		
	
	}
	public static int wage
	
	
	

}
