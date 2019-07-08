package chapter6Exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class NumberGuess {
//	(Guess the Number) Write an application that plays “guess the number” as follows: Your
//	program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
//	The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
//	guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
//	low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
//	user for the next guess. When the user enters the correct answer, display Congratulations. You
//	guessed the number!, and allow the user to choose whether to play again. [Note: The guessing technique
//	employed in this problem is similar to a binary search, which is discussed in Chapter 19,
//	Searching, Sorting and Big O.]
//	
	
	
	public static void guessNumber() {
		
		Scanner input= new Scanner(System.in);
//		int userNumber = 0;

		System.out.println("Guess a number between 1 and 1000");
		int userNumber = input.nextInt();
		
		System.out.println(NumberGuess.guess(userNumber));
		
		int newNumber = NumberGuess.guess(userNumber);
		
		System.out.println("new number is "+ newNumber);
		
		for (int counter = 1; counter<=10; counter ++) {
			
			System.out.println("1Guess a number between 1 and 1000");
			userNumber = input.nextInt();
			
			if(newNumber ==userNumber) {
				System.out.println("Congratulations. You guessed the number");
				break;
			}
			else if(newNumber > userNumber) {
				System.out.println("Too Low. Try again!");
			}
			else
				System.out.println("Too High. Try again!");
		}
	}
	
	public static int guess(int userNumber) {
		SecureRandom randomNumbers = new SecureRandom();
		
		int number = 1 + randomNumbers.nextInt(10);
			return number;	

	}

}
