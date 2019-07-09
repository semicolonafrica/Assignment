package chapter7;


	import java.security.SecureRandom;

	public class Dummy {
		public static SecureRandom randomNumbers = new SecureRandom();
		
		private static final int SNAKE_EYES = 2;
		private static final int TREY = 3;
		private static final int SEVEN = 7;
		private static final int YO_LEVEN = 11;
		private static final int BOX_CARS = 12;
		
		public static void main(String[] args) {
			
			
			rollDice();
			
//			int myPoint = 0;	
	//	
//			int[] sumOfDice = rollDice();
//			
//			String result = "";
		
//		switch(sumOfDice) {
//			case SEVEN:
//			case YO_LEVEN:
//				result = "WON";
//				System.out.print(result);
//				break;
//			case SNAKE_EYES:
//			case TREY:
//			case BOX_CARS:
//				result = "LOST";
//				System.out.print(result);
//				break;
//			default:
//				result = "CONTINUE";
//				myPoint = sumOfDice;
//				System.out.printf("Point is %d%n", myPoint);
//				break;
//		}
//		while(result == "CONTINUE") {
//			
//			sumOfDice = rollDice();
//			
//			if(sumOfDice == myPoint) {
//				result = "WON";
//				System.out.print(result);
//			} else if(sumOfDice == SEVEN) {
//				result = "LOST";
//				System.out.print(result);
//			}
//			
//		}
		
		}
		public static int[] rollDice() {
			
			int[] frequency = new int[14];
			
			for(int i = 1; i <= 1_000_000; i++) {
//			int die1 = 1 + randomNumbers.nextInt(6);
//			int die2 = 1 + randomNumbers.nextInt(6);
			
			
			++frequency[1 + randomNumbers.nextInt(6) + 1 + randomNumbers.nextInt(6)];
			//sum[i] = die1 + die2;
			}
			int store = 0;
			//display results of this roll
			for(int sum = 2; sum < frequency.length - 1; sum++) {
				
				
			System.out.printf("%d  %d%n",sum, frequency[sum]);
			
				
			}
				int value4  = frequency[4];
				int value5  = frequency[5];
				int value6  = frequency[6];
				int value8  = frequency[8];
				int value9  = frequency[9];
				int value10 = frequency[10];
			int win = frequency[7] + frequency[11];
			int loss = frequency[2] + frequency[3] + frequency[12];
			
			
			
			System.out.printf("Number won: %d%nNumber loss: %d", win,loss);
			
			return frequency;
			
		}
		
	}


