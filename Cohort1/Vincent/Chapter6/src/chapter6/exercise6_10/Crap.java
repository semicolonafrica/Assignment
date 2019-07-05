package chapter6.exercise6_10;

	import java.security.SecureRandom;

	public class Crap {
		
		private static final SecureRandom randomNumbers = new SecureRandom();
		
		public static int rollDice()
		{
			int die1 = 1 + randomNumbers.nextInt(6);
			int die2 = 1 + randomNumbers.nextInt(6);
			
			int sum = die1 + die2;
			
			System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
			
			System.out.println(Crap.sumOfDice(sum));
			return 0;
		}
		public static boolean sumOfDice(int sum)
		{
			String won;
			String lose;
			String contin;
			
			if ( sum == 7 || sum == 11) {
				System.out.print("YOU WIN");
			}
			
			if ( sum == 2 || sum == 3 || sum == 12) {
				System.out.print("YOU LOSE");
				System.out.println();
				
			}
			return true;
			
		}
	}
         
