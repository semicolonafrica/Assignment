import java.security.SecureRandom;

/**
 * 
 */


//Author  Olayinka Olayinka
// 21 June 2019

public class Craps {
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status {CONTINUE, WON,LOST};
	
	private static final int Snake_eyes = 2;
	private static final int TREY = 3;
	private static final int Seven = 7;
	private static final int YO_Leven = 11;
	private static final int BOX_CARS = 12;
	
	public static void main(String[]args) {
		int myPoint = 0;
		Status gameStatus;
		
		int sumOfDice = rollDice();
		
		switch(sumOfDice) {
		
			case Seven:
			case YO_Leven:
				gameStatus = Status.WON;
				break;
				
			case Snake_eyes:
			case TREY:
			BOX_CARS:
				gameStatus = Status.LOST;
					break;
			default:
				
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice;
				System.out.printf("Point is %d%n", myPoint);
				break;
		}
		
		while(gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();
			if(sumOfDice == myPoint) 
				gameStatus = Status.WON;
				
			else
				if(sumOfDice == Seven)
				gameStatus = Status.LOST;					
				}
		
			if(gameStatus == Status.WON) 
				System.out.println("You Win");
				
				else
					System.out.println("You lose");
				} 		
		public static int rollDice() {
			int die1 = 1 +  randomNumbers.nextInt(6);
			int die2 = 1 + randomNumbers.nextInt(6);
			
			int sum = die1 + die2;
			
			System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
			
			return sum;
		}
				
	}
	


