/* Author: ADEBAYO Johnson
 Date: 27/06/2019 
 Location of exercise:  Exercise 6, Question 6.32
 Purpose: Rolling dice and wager
*/

package chapter6.exercise633;
	import java.util.Scanner;
	import java.security.SecureRandom;
	public class ModifiedCrapGame2{
		// create secure random number generator for use in method rollDice
		private static final SecureRandom randomNumbers = new SecureRandom();
		
		// enum type with constants that represent the game status
		private static enum Status { CONTINUE, WON, LOST }; 
		// constants that represent common rolls of the dice
		static Scanner input = new Scanner(System.in);
		private static final int SNAKE_EYES = 2;
		private static final int TREY = 3;
		private static final int SEVEN = 7;
		private static final int YO_LEVEN = 11;
		private static final int BOX_CARS = 12; 
		static int bankBalance =1000;
		static int wager =0;
		static int sum = 0;
		//Status gameStatus; // can contain CONTINUE, WON or LOST
		static Status gameStatus;
		
		// plays one game of craps
		public static void main(String[] args) {
			enterWager();	
		}
		public static void enterWager() {
			System.out.println("Enter wager: ");
			wager = input.nextInt();
			if(wager <=bankBalance) {
				accumateBankBalance();
			}
			if(wager > bankBalance) {
				compareWagerToBalance();
			}
		}
		public static void displayBalance() {
			System.out.println("Bank balance is: " + bankBalance);	
		}
		public static void compareWagerToBalance() {
			for(int counter=1; wager>bankBalance; counter++) {
				if(bankBalance == 0) {
					System.out.println("Insufficient bank balance. ");
					break;
				}
					System.out.println("Enter a new wager (or 0 to quit): ");
					wager = input.nextInt();
					if((wager <= bankBalance) && (wager !=0)) {
						accumateBankBalance();
					}
					if(wager == 0) {
						System.out.println("You've quit the game!");
						displayBalance();
						break;	
					}
			}
		}
		public static void accumateBankBalance() { // method that roll dice when wager <= bankBalance
			//int myPoint = 0; // point if no win or loss on first roll
			int myPoint = 0;		
			int sumOfDice = rollDice();
			
			// determine game status and point based on first roll
			switch (sumOfDice){
				case SEVEN: // win with 7 on first roll
				case YO_LEVEN: // win with 11 on first roll
					gameStatus = Status.WON;
					break;
						
				case SNAKE_EYES: // lose with 2 on first roll
				case TREY: // lose with 3 on first roll
				case BOX_CARS: // lose with 12 on first roll
					gameStatus = Status.LOST;
					break;
				default: // did not win or lose, so remember point
					gameStatus = Status.CONTINUE; // game is not over
					myPoint = sumOfDice; // remember the point 
					System.out.printf("Point is %d%n", myPoint);
					break;
				}
				// while game is not complete
				while(gameStatus == Status.CONTINUE) {  // not WON or LOST
					sumOfDice = rollDice(); // roll dice again
					// determine game status
					if (sumOfDice == myPoint) { // win by making point
						gameStatus = Status.WON;
					}
					else {
						if(sumOfDice==SEVEN) { // lose by rolling 7 before point
							gameStatus = Status.LOST;
						}
					}
				}
				// display won or lost message
				if(gameStatus == Status.WON) {
					bankBalance = bankBalance + wager;
					System.out.println("Player wins");
					displayBalance();
					chatter();
					enterWager();
				}
				//compareWagerToBalance();
				
				else if (gameStatus == Status.LOST){
					bankBalance = bankBalance - wager;
					System.out.println("Player loses");
					displayBalance();
					chatter();
					if(bankBalance == 0) {
						chatter();
					}
					
					if(bankBalance > 0) {
						enterWager();
					}
					//chatter();
				}
				//chatter();
				//compareWagerToBalance();
				
		}
		public static void chatter(){ // method of the message to display
			if (bankBalance == 0) {
				System.out.println("Sorry, you busted! ");
			}
			if (bankBalance > 1000) {
				System.out.println("You're up big! ");
			}
			if ((bankBalance < 1000) && (bankBalance > 500) && (bankBalance != 0)) {
				System.out.println("Aw c'mon take a chance! ");
			}
			if ((bankBalance < 500) && (bankBalance != 0)) {
				System.out.println("Oh you're going for broke! ");
			}
		}
		public static int rollDice() { // method that roll the dice
			// pick random die values
			int die1 = 1 + randomNumbers.nextInt(6); // first die roll
			int die2 = 1 + randomNumbers.nextInt(6); // second die roll
			sum = die1 + die2; // sum of die values
			// display results of this roll
			System.out.printf("Player rolled %d + %d = %d%n",
			die1, die2, sum);
			return sum;
		}
	}
