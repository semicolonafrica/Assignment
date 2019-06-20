

import java.security.SecureRandom;

public class CrapGame {
	
	private int two = 2;
	private int three = 3;
	private int seven = 7;
	private int eleven = 11;
	private int twelve = 12;
	
	
	SecureRandom randomNumbers = new SecureRandom();
	
	public  void getResult() {
		
	
		if(sum == seven || sum == eleven) {
			System.out.print("You Win");
		}
		else if(sum == two || sum == three || sum == twelve) {
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

		public int rollDice() {
			int die1 =1 + randomNumbers.nextInt(6);
			int die2 = 1 + randomNumbers.nextInt(6);
			
			int sum = die1 + die2;
			System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
			return sum;
			
		}
		private int sum = rollDice();
}
