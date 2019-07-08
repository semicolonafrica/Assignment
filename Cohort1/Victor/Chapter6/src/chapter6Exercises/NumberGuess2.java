package chapter6Exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class NumberGuess2 {
	
//	Guess the Number Modification) Modify the program of Exercise 6.30 to count the number
//	of guesses the player makes. If the number is 10 or fewer, display Either you know the secret
//	or you got lucky! If the player guesses the number in 10 tries, display Aha! You know the secret!
//	If the player makes more than 10 guesses, display You should be able to do better! Why should it
//	take no more than 10 guesses? Well, with each “good guess,” the player should be able to eliminate
//	half of the numbers, then half of the remaining numbers, and so on.
//	6.32 (Distance Between Points) Write method distance to calculate
	
	public static void guessNumber() {
		
		Scanner input= new Scanner(System.in);
		int userNumber = 0;
		int newNumber =0;

		System.out.println("Guess a number between 1 and 1000");
		userNumber = input.nextInt();
		
		System.out.println(NumberGuess.guess(userNumber));
		
		newNumber = NumberGuess.guess(userNumber);
		
		System.out.println("new number is "+ newNumber);
		
		while(newNumber!=userNumber) {
			
			System.out.println("1Guess a number between 1 and 1000");
			userNumber = input.nextInt();
//			break;
//		}
//			if()
		}
	}
	
	public static int guess(int userNumber) {
		SecureRandom randomNumbers = new SecureRandom();
		
		int number = 1 + randomNumbers.nextInt(10);
		
			if(number == userNumber) {
				System.out.println("Congratulations. You guessed the number");
			}
			else if(number > userNumber) {
				System.out.println("Too Low. Try again!");
			}
			else
				System.out.println("Too High. Try again!");
			return number;	

	}

}

}
