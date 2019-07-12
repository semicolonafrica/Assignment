package chapter7Exercises;

import java.security.SecureRandom;
import java.util.Scanner;


public class GameOfCraps {
		
		private static final SecureRandom random = new SecureRandom();
		Scanner input = new Scanner(System.in);
		// enum type with constants that represent the game status
		private enum Status { CONTINUE, WON, LOST };
		
		private static final int SNAKE_EYES = 2;
		private static final int TREY = 3;
		private static final int SEVEN = 7;
		private static final int YO_LEVEN = 11;
		private static final int BOX_CARS = 12;
		
		public static void calRoll() {
			
			int myPoint = 0; // point if no win or loss on first roll
			int[] winFrequency = new int[21];
			int[] lostFrequency = new int[21];
			
			Status gameStatus; // can contain CONTINUE, WON or LOST
			int numberOfRolls=2;
			System.out.printf("%s%12s%12s%n", "Roll","Wins", "Lost");
			
//			for (int roll =1; roll <=numberOfRolls; roll++) {
////				System.out.println("Number of roll");
//				for (int counter1 =1; counter1 <=roll; counter1++) {	
					
			int sumOfDice = rollDice(); // first roll of the dice
			
		
			switch (sumOfDice) {
			        case SEVEN: // win with 7 on first roll
			        case YO_LEVEN: // win with 11 on first roll
			            gameStatus = Status.WON;
			            ++winFrequency[sumOfDice];
			            break;
			         case SNAKE_EYES: // lose with 2 on first roll
			         case TREY: // lose with 3 on first roll
			         case BOX_CARS: // lose with 12 on first roll
			               gameStatus = Status.LOST;
			               ++lostFrequency[sumOfDice];
			               break;
			         default: // did not win or lose, so remember point
			        	 gameStatus = Status.CONTINUE; // game is not over
			        	 myPoint = sumOfDice; // remember the point
//			        	 System.out.printf("Point is %d%n", myPoint);
			        	 break;
				}
			
			while (gameStatus == Status.CONTINUE) { // not WON or LOST 
				sumOfDice = rollDice(); // roll dice again
				
				if (sumOfDice == myPoint) // win by making point
					gameStatus = Status.WON;
//				++winFrequency[sumOfDice];
				else
					if (sumOfDice == SEVEN)
						gameStatus = Status.LOST;
//				++lostFrequency[sumOfDice];
			}
			
//		
		}
	    public static int rollDice() {
	    	int die1 =1 + random.nextInt(6);
	    	int die2 = 1 + random.nextInt(6);
		
	    	int sum = die1 + die2;
//		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		return sum;
	}


	public static void main(String[] args) {
		GameOfCraps.calRoll();

	}

}
