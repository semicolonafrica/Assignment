package chapter6.exercises;

import java.security.SecureRandom;

/**
 * @author LEMON
 *
 */
public class CrapGame {

	static int two = 2;
	static int three = 3;
	static int seven = 7;
	static int eleven = 11;
	static int twelve = 12;

	static SecureRandom randomNumbers = new SecureRandom();

	public static void getResult() {

		if (sum == seven || sum == eleven) {
			System.out.print("You Win");
		} else if (sum == two || sum == three || sum == twelve) {
			System.out.print("You lose");
		} else if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
			System.out.println("Your point is " + sum);
			int sum2 = 0;
			int sum3 = sum;
			while (sum2 != 7) {
				sum2 = rollDice();
				if (sum2 == sum3) {
					System.out.print("You win");
					break;
				}
				if (sum2 == 7) {
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

	private static int sum = rollDice();
	
	public static void main(String[] args) {
		getResult();
	}
}