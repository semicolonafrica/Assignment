package exercise7_18;
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

	
	public void calRoll() {
		int myPoint = 0; // point if no win or loss on first roll
    	int roll = 1;
//		
		Status gameStatus; // can contain CONTINUE, WON or LOST
		int [] holdWin = new int [22];
		int [] holdLost = new int [22];
	
		
		for(int count = 1; count <= 1_000_000; count++) {
			
			int sumOfDice = rollDice(); // first roll of the dice
		switch (sumOfDice) {
		        case SEVEN: // win with 7 on first roll
		        case YO_LEVEN: // win with 11 on first roll
		            gameStatus = Status.WON;
		         case SNAKE_EYES: // lose with 2 on first roll
		         case TREY: // lose with 3 on first roll
		         case BOX_CARS: // lose with 12 on first roll
		               gameStatus = Status.LOST;
		               break;
		         default: // did not win or lose, so remember point
		        	 gameStatus = Status.CONTINUE; // game is not over
		        	 myPoint = sumOfDice; // remember the point
		        	 break;
			}
		
		
		while (gameStatus == Status.CONTINUE) { // not WON or LOST 
			sumOfDice = rollDice(); // roll dice again
			roll++;
			
			if (sumOfDice == myPoint) // win by making point
				gameStatus = Status.WON;
			else
				if (sumOfDice == SEVEN)
					gameStatus = Status.LOST;
		}	
			if(gameStatus == Status.WON) {
				
				if(count <= 20)
					++holdWin[count];
				
				if(count > 20)
					++holdWin[21];
			}
			
			if(gameStatus == Status.LOST) {
				
				if(count <= 20)
					++holdLost[count];
				
				if(count > 20)
					++holdLost[21];
			}
		
		}
		
		int q= 0 , z =0;
		int  r =0;
		
		for(int w = 1;  w< holdWin.length; w++) {
			
		q = holdWin[w] + holdWin[r];
		holdWin[w] = q;
		
				z = holdLost[w] + holdLost[r];
		holdLost[w] = z;
			
			r++;
		}
			System.out.printf("%s%10s%12s%n", "No. Of Rolls", "Wins", "Loss");
			
			for(int i = 1; i < holdWin.length; i++) {
				
				System.out.printf("%6d %23d%14d%n" , i, holdWin[i] , holdLost[i]);
			}
			
     		int chanceOfWinning = holdWin[21] / 10000;
     		
     		System.out.printf("Chance of winning crap = %d%s%n", chanceOfWinning, "%");
     		System.out.printf("Average length of a game of craps = %d%n", (roll/holdWin[21]));
		}
	
	
     public int rollDice() {
	       int die1 =1 + random.nextInt(6);
	       int die2 = 1 + random.nextInt(6);
	
	       int sum = die1 + die2;
	        
	          return sum;
     }
	}

