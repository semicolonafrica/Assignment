/**
 * 
 */
package chapter7.exercise7_18;

import java.security.SecureRandom;


/**
 * @author USER
 *
 */
public class CrapGame {

	private static final SecureRandom randomNumbers = new SecureRandom();

	private enum Status {CONTINUE, WON, LOST};
	static Status gameStatus; 

	// constants that represent common rolls of the dice
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static int checkGame() {

		int myPoint = 0; 
		int sumOfDice = 0;

		int win = 0;
		int loss = 0;
		int cont = 0;
		
		sumOfDice = rollDice(); 

		switch (sumOfDice) {

		case SEVEN: 
		case YO_LEVEN:
			gameStatus = Status.WON;
			win++;
			break;
			
		case SNAKE_EYES: 
		case TREY: 
		case BOX_CARS: 
			gameStatus = Status.LOST;
			loss++;
			break;
			
		default: 
			gameStatus = Status.CONTINUE;
			cont++;
			myPoint = sumOfDice; 
			System.out.printf("Point is %d%n", myPoint);
			break;
		}
		
		

		while(gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();

			if (sumOfDice == myPoint) {
				gameStatus = Status.WON;
			}
			else {
				if (sumOfDice == SEVEN) 
				gameStatus = Status.LOST;
			}
			cont++;
		}

		if(gameStatus == Status.WON) {
			win+=cont;
			System.out.println("Player wins");
			return win;
		}
		else {
			System.out.println("Player loses");
			return loss;
		}
	}
	
	public static int rollDice() {
		
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6); 

		int sum = die1 + die2; 

		System.out.printf("Player rolled %d + %d = %d%n",die1, die2, sum);

		return sum;
	}
	
	 public static void calRoll() {
		 
		 int [] freqWin = new int [25];
		 int [] freqLoss = new int [25];
		 int winGame =0; 
		 int lossGame =0;
		 
		 for(int i = 1; i < 5; i++) {
			 
			 int roll = checkGame();
//			 if(gameStatus == Status.WON) {
//				 ++freqWin[roll];
//			 }
//			 if(gameStatus == Status.LOST) {
//				 ++freqLoss[roll];
//			 }

				try {

				if(gameStatus == Status.WON ) {
					++freqWin[roll];

				}
				else {
				 ++freqLoss[roll];

				}	
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e);

				}
		
		 }
		 displayArray(freqWin, freqLoss);
			System.out.println();

			winGame = sumArray(freqWin);
			lossGame = sumArray(freqLoss);

			double chance = (double)winGame/(winGame + lossGame);

			System.out.printf("%nElement of chance is: %.3f%n%n", chance);
	 }
	
	 
	 public static void displayArray(int[] array, int[] array2) {
		 
		 System.out.printf("%2s%5s%5s%n","Rolls","Win","Loss");
		 
		 for(int count = 1; count < array.length; count++) {
				System.out.printf("%2d%1d%2 d%n", count, array[count], array2[count]);
				//System.out.println();
			}
	 }	
	 
	 public static int sumArray(int[] array) {
			int total = 0;

			for(int value: array) {
				total+= value;
			}
			return total;
		}
}


