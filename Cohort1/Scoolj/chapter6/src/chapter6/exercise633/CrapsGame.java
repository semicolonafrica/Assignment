/**
 * 
 */
package chapter6.exercise633;

import java.util.Scanner;
import java.security.SecureRandom;
/**
 * @author Scoolj, Oluwajuwonlo
 *
 */
public class CrapsGame {
	private static Scanner input = new Scanner(System.in);
	static int point=0;
	static enum Status {WON, LOST, CONTINUE};
	public static int findCrapGame() {
		int crapGame = 0;
	System.out.println(" Enter 1 play crap");
	int start = input.nextInt();
	if (start == 1) {
		
		crapGame = calculateCrapsGameScore();
	}
	else if (start == 0) {
		System.exit(0);
	}
		
		return crapGame;
	}
	public static int calculateCrapsGameScore() {
		int  pointM = randomValue();
		int myPoint = 0;
		Status gameStatus = null;
		
		switch (pointM){
		case 7:
		case 11:
		gameStatus = Status.WON;
		break;
		case 2:
		case 3:
		case 12:
		gameStatus = Status.LOST;
		break;
		case 4:
		case 5:
		case 6:
		case 8:
		case 9:
		case 10:
		gameStatus = Status.CONTINUE;
		myPoint = point;
		break;
		}
		
	 	while (gameStatus == Status.CONTINUE) {
	 		point = randomValue();
	 		
	 	if (myPoint ==7) {
	 		gameStatus =Status.LOST;
				}
				else if (point== myPoint) {
					gameStatus = Status.WON;
				}
			}
		
			return myPoint;
	}
	
	public static int randomValue() {
		SecureRandom randomNumber = new SecureRandom();
		int roll1 = 1 + randomNumber.nextInt(5);
		int roll2 = 1 + randomNumber.nextInt(5);
		
		int sumRoll = roll1 + roll2;
		return sumRoll;
	}
}
