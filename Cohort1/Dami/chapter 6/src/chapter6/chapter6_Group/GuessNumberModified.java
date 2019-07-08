package chapter6.chapter6_Group;
import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumberModified {
		
	public static void guessTheNumber() {
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		
		int hiddenNumber = 1 + random.nextInt(10);

		System.out.print("Enter your firstGues: ");
		int firstGuess = input.nextInt();
		
		if(firstGuess == hiddenNumber) {
			System.out.println("Congratulations");
		}
		
		int guessCounter = 1;
		while(firstGuess != hiddenNumber){
			
			if(firstGuess != hiddenNumber && firstGuess > hiddenNumber) {
				System.out.print("Incorrect, too high try again: ");
				firstGuess = input.nextInt();
			}
			else if(firstGuess != hiddenNumber && firstGuess < hiddenNumber) {
					System.out.print("Incorrect, too low try again: ");
					firstGuess = input.nextInt();
				}
			guessCounter++;
		}
		
		System.out.println("Congratulations");
		
		System.out.printf("%s%d%s%n", "You had ", guessCounter - 1, " wrong guess(es) before you got luck!");
		if(guessCounter <= 9) {
			System.out.println("Either you know the secret or you got lucky.");
		}
		else if(guessCounter == 10) {
			System.out.println("Aha! you know the secret.");
		}
		else {
			System.out.println("You should be able to do better! Why should it\n" + 
					"take no more than 10 guesses?");
		}
		
		}
}