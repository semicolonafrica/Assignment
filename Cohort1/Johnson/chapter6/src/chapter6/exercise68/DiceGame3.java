package chapter6.exercise68;

import java.security.SecureRandom;
import java.util.Scanner;

public class DiceGame3 {
	static int x;
	static int y;
	static int p;
	static int q;
	static int sum1=0;
	static int sum2 = 0;
	
	public static void player1Dice() {
		Scanner input = new Scanner(System.in);
		System.out.println("Player number: ");
		int player1 = input.nextInt();
		
		SecureRandom random =new SecureRandom();
		x= 1 + random.nextInt(6);
		y = 1 + random.nextInt(6);
		sum1 = x + y;
		System.out.println("Player1 rolled " + x + " + " + y + " = " + sum1 );
	}

	public static void player2Dice() {
		Scanner input = new Scanner(System.in);
		System.out.println("Player number: ");
		int player2 = input.nextInt();
		
		SecureRandom randomNumber =new SecureRandom();
		p= 1 + randomNumber.nextInt(6);
		q = 1 + randomNumber.nextInt(6);
		sum2 = p + q;
		System.out.println("Player2 rolled " + x + " + " + y + " = " + sum2 );
	}
	public static void comparePlayerSum() {
		for (int i = 1; i<=10; i++) {
			if (sum1 > sum2) {
				System.out.println("Player1 wins");
				break;
			}
			if (sum2 > sum1) {
				System.out.println("Player2 wins");
				break;
			}
			if (sum1 == sum2) {
				System.out.println("Play again");
				player1Dice();
				player2Dice();
				comparePlayerSum();
				continue;
			}
		}	
	}


	public static void main(String[] args) {
		System.out.println("Select your number:");
		player1Dice();
		player2Dice();
		comparePlayerSum();

	}

}
