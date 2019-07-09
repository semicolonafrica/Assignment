package chapter7;

import java.security.SecureRandom;
		

			public class newCraps {
			public static SecureRandom randomNumbers = new SecureRandom();
			
			private static final int SNAKE_EYES = 2;
			private static final int TREY = 3;
			private static final int SEVEN = 7;
			private static final int YO_LEVEN = 11;
			private static final int BOX_CARS = 12;
			
			public static void main(String[] args) {
				
				String result = "";
				int myPoint = 0;	
				//int[] sumOfDice = new int[14];
				int sumOfDice = 0;
				int frequencyWin = 0;
				int frequencyLoss = 0;
				System.out.printf("%5s%5s%n","WON","LOSS");
				for(int r = 1; r <= 40;r++) {
					
					sumOfDice = rollDice() ;
					switch(sumOfDice) {
					case SEVEN:
					case YO_LEVEN:
						result = "WON";
					//	System.out.print(result);
						frequencyWin++;
						break;
					case SNAKE_EYES:
					case TREY:
					case BOX_CARS:
						result = "LOST";
						//System.out.print(result);
						frequencyLoss++;
						break;
					default:
						result = "CONTINUE";
						myPoint = sumOfDice;
						//System.out.printf("Point is %d%n", myPoint);
						break;
				}
				while(result == "CONTINUE") {
					
					sumOfDice = rollDice();
					
					if(sumOfDice == myPoint) {
						result = "WON";
						//System.out.print(result);
						frequencyWin++;
					} else if(sumOfDice == SEVEN) {
						result = "LOST";
						//System.out.print(result);
						frequencyLoss++;
					}
					
				}
				
				System.out.printf("%5d%5d%n",frequencyWin,frequencyLoss);
				}
				//int myPoint = 0;	
				//	
//				for(int sum = 2; sum < sumOfDice.length - 1; sum++) {
//				System.out.printf("%d  %d%n",sum, sumOfDice1[sum]);
//				}
//				String result = "";
					
			}
			
			
			public static int rollDice() {
				
				int die1 = 1 + randomNumbers.nextInt(6);
				int die2 = 1 + randomNumbers.nextInt(6);
				
				int sum = die1 + die2;
				
				//display results of this roll
				//System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
			
				return sum;
			}


	}

