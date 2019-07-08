/* Author: ADEBAYO Johnson
 Date: 26/06/2019 
 Location of exercise:  Exercise 6, Question 6.31
 Purpose: Guess number game 
*/
package chapter6.exercise630;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber{

	public static void main(String[] args) {
		guessNumber();
	}
	public static void guessNumber() {
		SecureRandom random = new SecureRandom();
		int x = 1 + random.nextInt(1000);
		Scanner input = new Scanner(System.in);
		int z =0;
		for(int counter =1; counter<=1000000; counter++) {
			System.out.println("Guess a number between 1 and 1000: ");
			int y = input.nextInt();
			//System.out.println(x);
			if(x == y) {
				System.out.println("Congratulations. You guessed the number!");
				System.out.println("Do you wish to play again? Enter 1(Yes) or Enter 2(No):");
				z = input.nextInt();
				if(z==1) {
					x = 1 + random.nextInt(1000);
					continue;	
				}
				if(z==2) {
					System.out.println("Thank you for playing.");
					break;	
				}	
			}
			if((x != y) && (y-x >= 100) && (y>x)) {
				System.out.println("Too high. Try again.");	
				
			}
			if((x != y) && (x-y >= 100) && (x>y)) {
				System.out.println("Too low. Try again.");	
			}
			if((x != y) && (x-y < 100) && (x > y)) {
				System.out.println("You are not too far. Try again.");	
			}
			if((x != y) && (y-x < 100) && (y > x) ) {
				System.out.println("You are not too far. Try again.");	
			}
		}


	}
}