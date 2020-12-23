/* Author: ADEBAYO Johnson
 Date: 26/06/2019 
 Location of exercise:  Exercise 6, Question 6.31
 Purpose: Guess number game (modified)
*/
package chapter6.exercise631;

import java.security.SecureRandom;
import java.util.Scanner;

public class ModifiedGuessNumber {

	public static void main(String[] args) {
		guessNumber();
	}
	public static void guessNumber() {
		SecureRandom random = new SecureRandom(); // 
		int x = 1 + random.nextInt(1000); // create random number and store as x
		Scanner input = new Scanner(System.in); // input object of the class Scanner
		int z =0; // initializing variable z 
		for(int counter =1; counter<=1000000; counter++) { // creating loop 
			System.out.println("Guess a number between 1 and 1000: "); // message for user to enter predicted number
			int y = input.nextInt(); // store the entered value by the user as y
			System.out.println(x); // print the randomly generated number by the system(optional)
			if((x == y) && (counter < 10)) { // setting condition if number entered by the user match the generated number
				System.out.println("Congratulations! Either you know the secret or you got lucky!");
				System.out.println("Do you wish to play again? Enter 1(Yes) or Enter 2(No):");
				z = input.nextInt();
				if(z==1) { // condition for the user to continue playing game
					x = 1 + random.nextInt(1000); // generate another value when the user's guess is right
					counter = 0; // initialize counter to zero
					continue; // continue if the user's selection is 1 (yes)
				}
				if(z==2) { // end the game if the user's selection is 2 (No)
					System.out.println("Thank you for playing.");
					break;	
				}	
			}
			if((x == y) && (counter == 10)) {
				System.out.println("Congratulations! Aha! You know the secret!");
				System.out.println("Do you wish to play again? Enter 1(Yes) or Enter 2(No):");
				z = input.nextInt();
				if(z==1) {
					x = 1 + random.nextInt(1000);
					counter = 0;
					continue;	
				}
				if(z==2) {
					System.out.println("Thank you for playing.");
					break;	
				}	
			}
			if((x == y) && (counter > 10)) {
				System.out.println("Congratulations! You should be able to do better!");
				System.out.println("Do you wish to play again? Enter 1(Yes) or Enter 2(No):");
				z = input.nextInt();
				if(z==1) {
					x = 1 + random.nextInt(1000);
					counter = 0;
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
