package chapter6_exercises;

import java.security.SecureRandom;

//Class Work
//Program to simulate game of chance without using enum
//Program written by Oyemade Temitope
//19th of June 2019
public class Crap {

	
	public static int rollDice() {
		
		SecureRandom random = new SecureRandom();
		int dice1 = 1 + random.nextInt(6);
		int dice2 = 1 + random.nextInt(6);
		
		int sum = dice1 + dice2;
		
		  System.out.printf("You rolled %d + %d = %d%n", dice1, dice2, sum);

		return sum;
			
	}
	
	
	public String determineOutcome() {
		int newPoint = 0;
		String gameStatus;
		int game = rollDice();

		
		switch(game) {
		case 7: case 11:
			gameStatus = "Win";
			break;
		
		case 2: case 3: case 12:
			gameStatus = "Lose";
			break;
			
		default:
			gameStatus = "Continue";
			newPoint = game;
			break;
		}
		
		while(gameStatus.equals("Continue")) {
			
		int newSum = rollDice();
		
		if(newSum == newPoint  ) {
			gameStatus = "Win";
		break;}
		
		if(newSum == 7) {
			gameStatus = "Lose";
			break;
			}		
		}
		return gameStatus;
	}
}
