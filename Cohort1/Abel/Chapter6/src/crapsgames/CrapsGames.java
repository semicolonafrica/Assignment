package crapsgames;

import java.security.SecureRandom;
public class CrapsGames {
    static SecureRandom randomNumbers = new SecureRandom();
	public static void CheckOutcome() {
		
		final int snakeEyes = 2;
		final int trey = 3;
		final int seven = 7;
		final int yoLeven = 11;
		final int boxCars = 12;
		final int sum = rollDice();
			
			
			if(sum == seven || sum == yoLeven) {
				System.out.print("You Win");
			}
			else if(sum == snakeEyes || sum == trey || sum == boxCars) {
				System.out.print("You lose");
			}
			else if(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
				System.out.println("Your point is " + sum);
				int sum2 = 0;
				int sum3 = sum;
				while(sum2 != 7) {
					sum2 = rollDice();
					if(sum2 == sum3) {
						System.out.print("You win");
						break;
					}
					if(sum2 == 7) {
						System.out.println("You Lose");
						break;
					}
				}
			}		
	}
	public static int rollDice() {
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		return sum;
	}
}

