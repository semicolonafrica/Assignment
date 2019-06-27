package chapter6.chapter6_Group;
import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber {
public static void guessTheNumber() {
	Scanner input = new Scanner(System.in);
	SecureRandom randomNumber = new SecureRandom();
	
	
	
	int hiddenNumber = 1 + randomNumber.nextInt(10);
	
	System.out.print("Enter your firstGues: ");
	int firstGuess = input.nextInt();
	
	if(firstGuess == hiddenNumber) {
		System.out.println("Congratulations");
	}
	
	int guessCount = 0;
	
	for( ; firstGuess!= hiddenNumber;) {
		if(firstGuess != hiddenNumber && firstGuess > hiddenNumber) {
			System.out.print("Incorrect, too high try again: ");
			firstGuess = input.nextInt();
		}
		else if(firstGuess != hiddenNumber && firstGuess < hiddenNumber) {
				System.out.print("Incorrect, too low try again: ");
				firstGuess = input.nextInt();
			}
		guessCount += 1;
	}
	System.out.println("Congratulations");
	
	
	
	
	}
	
	public static void main(String args[]) {
		GuessNumber.guessTheNumber();
	}
}
