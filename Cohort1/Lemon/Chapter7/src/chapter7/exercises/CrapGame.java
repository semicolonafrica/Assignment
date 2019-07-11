package chapter7.exercises;

import java.security.SecureRandom;

public class CrapGame {

		private static final SecureRandom randomNumbers = new SecureRandom();
		
		// enum type with constants that represent the game status
		private enum Status { CONTINUE, WON, LOST };
		
		//constants that represent common rolls of the dice
		private static final int SNAKE_EYES = 2;
		private static final int TREY = 3;
		private static final int SEVEN = 7;
		private static final int YO_LEVEN = 11;
		private static final int BOX_CARS = 12;
		private static int wins = 0;
		private static int losses = 0;
		private static int[] noOfWinRolls = new int[21];
		private static int[] noOfLossRolls = new int[21];
		private static int i = 0;
		
		// plays one game of craps
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			
			for (int t =1; t<=1_000_000; t++) {
				int myPoint = 0; // point if no win or loss on first roll
				Status gameStatus; // can contain CONTINUE, WON or LOST
			
				int sumOfDice = rollDice(); // first roll of the dice
				
				// determine game status and point based on first roll
				switch (sumOfDice) 
				{
					case SEVEN: // win with 7 on first roll
					case YO_LEVEN: // win with 11 on first roll
						gameStatus = Status.WON;
						noOfWinRolls[0] += 1; 
						break;
					case SNAKE_EYES: // lose with 2 on first roll
					case TREY: // lose with 3 on first roll
					case BOX_CARS: // lose with 12 on first roll
						gameStatus = Status.LOST;
						noOfLossRolls[0] += 1;
						break;
					default: // did not win or lose, so remember point
						gameStatus = Status.CONTINUE;
						myPoint = sumOfDice; // remember the point
						break;
				}
			
				i = 0;
				// while game is not complete
				while (gameStatus == Status.CONTINUE) // not WON or LOST
				{
					sumOfDice = rollDice(); // roll dice again
					i += 1;
					
					// determine game status
					if (sumOfDice == myPoint) {
						gameStatus = Status.WON;
						if (i <= 19)
							noOfWinRolls[i] += 1;
						else
							noOfWinRolls[20] += 1;
					}
					else 
						if (sumOfDice == SEVEN) {
							gameStatus = Status.LOST;
							if (i <= 19)
								noOfLossRolls[i] += 1;
							else
								noOfLossRolls[20] += 1;
						}
				}
			
				// display won or lost message
				if (gameStatus == Status.WON) {
					wins +=1; }
				else {
					losses += 1; }
				
				System.out.println();
			}
			
			
			
			System.out.println("Wins: " + wins +"\n"+ "Losses: " + losses);
			
			System.out.println();	
			
			for (int y = 0; y< noOfWinRolls.length; y++) {
				System.out.println("Wins in "+ y + " : " + noOfWinRolls[y]);
			}
			System.out.println();	
			for (int y = 0; y< noOfLossRolls.length; y++) {
				System.out.println("Losses in "+ y + " : " + noOfLossRolls[y]);
			}
			
			
		}
		
		// roll dice, calculate sum and display results
		public static int rollDice()
		{
			// pick random die values
			int die1 = 1 + randomNumbers.nextInt(6); // first die roll
			int die2 = 1 + randomNumbers.nextInt(6); // second die roll
			
			int sum = die1 + die2; // sum of die values
			
			return sum;
		}

}
