package exercise7_18;
import java.security.SecureRandom;

public class CrapsGame {
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status { CONTINUE, WON, LOSS};
	
	private static final int SNAKE_EYES =2;
	private static final int TREY = 3;
	private static final int  SEVEN =7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	

	public static int rollDice() {
		
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
	
		int sum = die1 + die2;
		
		//System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		
		return sum;
	}
	
	public static void callRoll() {
		int roll = 1;
		
//		int frequencyWon = 0;
//		int frequencyLoss = 0;
//		
		int myPoint = 0;
		Status gameStatus;
		int[] holdWin = new int[22];
		int[] holdLost = new int[22];
		
		for(int count = 1; count <= 1_000_000; count++) {
		
		int sumOfDice =  rollDice();
		
		switch (sumOfDice){
		
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			//++frequencyWon;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOSS;
			//++frequencyLoss;
			break;
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			//System.out.printf("point is %d%n", myPoint);
			break;
		
		}
		
		while (gameStatus == Status.CONTINUE) {
			
			sumOfDice = rollDice();
			roll++;
			if(sumOfDice == myPoint) {
				gameStatus = Status.WON;
			//++frequencyWon;
			}
			else {
				if(sumOfDice == SEVEN) {
					gameStatus = Status.LOSS;
					//++frequencyLoss;
				}
			}
		}
					if(gameStatus == Status.WON) {
						
						if(count <= 20)
							++holdWin[count];
						
						if(count > 20)
							++holdWin[21];
					}
					
					if(gameStatus == Status.LOSS) {
						
						if(count <= 20)
							++holdLost[count];
						
						if(count > 20)
							++holdLost[21];
					}
		}
				
				
				int q= 0 , z =0;
				int  r =0;
				
				for(int w = 1;  w < holdWin.length; w++) {
					
				q = holdWin[w] + holdWin[r];
				holdWin[w] = q;
				
				z = holdLost[w] + holdLost[r];
				holdLost[w] = z;
					
					r++;
				}
					System.out.printf("%s%10s%12s%n", "No. Of Rolls", "Wins", "Loss");
					
					for(int i = 1; i < holdWin.length; i++) {
						
						System.out.printf("%6d %12d%14d%n" , i, holdWin[i] , holdLost[i]);
					}
					
		     		int chanceOfWinning = holdWin[21] / 10000;
		     		
		     		System.out.printf("Chance of winning crap = %d%s%n", chanceOfWinning, "%");
		     		System.out.printf("Average length of a game of craps = %d%n", (roll/holdWin[21]));
				

				
			}
		
		
		//System.out.printf("%d%5d%n", frequencyWon,frequencyLoss);	
	
		public static void main(String[] args) {
			callRoll();
			
		}
	}

		
		//if(gameStatus == Status.WON)
			//System.out.println("Player Wins");
		//else
			//System.out.println("Player loss");

		
	
	
	

