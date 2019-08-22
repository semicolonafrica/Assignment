package exercise7_18;

import java.security.SecureRandom;


public class GameofCraps {
	private enum Status{WON, LOSE, CONTINUE};
	
	private static final SecureRandom random = new SecureRandom();
	
	private static final int SEVEN =7;
	private static final int ELEVEN = 11;
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int BOX_CARS = 12;
	
	private static int die1 = 0;
	private static int die2 = 0;
	private static int sum = 0;
	
	static int myPoint = 0;
	static Status gameStatus;
	static int sumOfDie = rollDie();
	static int  roll= 1;
	

	private static int rollDie() {
		die1 =1 + random.nextInt(6);
		die2 = 1 + random.nextInt(6);
		sum = die1 + die2;
		return sum;
	}
	
	public static void proceed() {
		if(roll == 1) {
			sumOfDie = rollDie();
			if(sumOfDie == SEVEN||sumOfDie == ELEVEN) {
				gameStatus = Status.WON;
			}
			else if ((sumOfDie == TREY)||(sumOfDie == BOX_CARS)||(sumOfDie == SNAKE_EYES) ) {
				gameStatus = Status.LOSE;
			}
			else {
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDie;
			}
		}
			while(gameStatus == Status.CONTINUE) {
				roll++;
				sumOfDie = rollDie();
				if(sumOfDie == SEVEN) {
					gameStatus = Status.LOSE;
					break;
				}
				else if(sumOfDie == myPoint) {
					gameStatus = Status.WON;
					break;
				}
				else {
					gameStatus = Status.CONTINUE;
				}
			}
	}
	
	public static void main(String[] args) {
		int[] numOfRolls = new int[25];
		int b=0;
		for(int count = 1; count < 1000000; count++) {
			proceed();
			try{
				++numOfRolls[roll];
			}
			catch(ArrayIndexOutOfBoundsException e) {
				b++;
				System.out.println(e);
				System.out.printf("%5d%5d%n", count, roll);
			}
//			if(gameStatus == Status.WON)
//				System.out.printf("%7d%7d%10s%n", count, roll , gameStatus);
			roll = 1;
		}
		int a =0;
		for(int num: numOfRolls) {
			System.out.println(a++ +" "+ num);
		}
		System.out.println("number of games that went beyond "+ numOfRolls.length + " is "+ b);
	}
	

}
