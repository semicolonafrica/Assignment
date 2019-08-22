package examples;
import java.security.SecureRandom;

public class Craps {
	private enum Status{WON, LOSE, CONTINUE};
	
	private static final SecureRandom random = new SecureRandom();
	
	private static final int SEVEN =7;
	private static final int YO_LEVEN = 11;
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int BOX_CARS = 12;
	
	private static int die1 = 0;
	private static int die2 = 0;
	private static int sum = 0;
	
	public static int rollDie() {
		die1 = 1 + random.nextInt(6);
		die2 = 1 + random.nextInt(6);
		sum = die1 + die2;
		System.out.printf( "Player rolled %d + %d = %d\n",die1, die2, sum );
		return sum;
	}
	
	public static void main(String[] args) {
		int myPoint = 0;
		Status gameStatus;
		int sumOfDie = rollDie();
		
		switch(sumOfDie) {
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOSE;
			default:
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDie;
				System.out.printf( "Point is %d\n", myPoint );
				break;
		}
		
		while(gameStatus== Status.CONTINUE) {
			sumOfDie = rollDie();
			if(sumOfDie == myPoint) {
				gameStatus = Status.WON;
			}
			else if(sumOfDie == SEVEN) {
				gameStatus = Status.LOSE;
			}
		}
		if(gameStatus== Status.WON) {
			System.out.println("player won");
		}
		else {
			System.out.println("player lost");
		}

	}
}
