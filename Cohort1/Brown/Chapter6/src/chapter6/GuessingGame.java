package Chapter6.exercise6_30;

import java.util.Scanner; import java.security.SecureRandom;
public class GuessingGame {

	private enum Mode {HIGH,LOW,YES,}
	static Scanner input = new Scanner(System.in);
	static SecureRandom randomNumber = new SecureRandom();
	static int guess;
	static int value;
	static int tries = 0;
	
	public static void guessNumber() {
		
		Mode gameStatus;
		System.out.println("Guess a correct number between 1 and 1000: ");
	
		value = 1 + randomNumber.nextInt(1000);
		while (guess != value) {
			
			guess = input.nextInt();
			
			if(guess < value) {
				gameStatus = Mode.LOW;
				System.out.println("Too low, Please try again");
			}
			
			else if(guess > value) {
				gameStatus = Mode.HIGH;
				System.out.println("Too High, Please try again");
			}
			
			else if(guess == value) {
				gameStatus = Mode.YES;
				System.out.println("CONGRATULATIONS! You guessed the number");
				
				break;
			}
			
			tries++;
		}
		
		if(tries <= 10) {
			System.out.println("Either You know the Secret or you got Lucky");
		}
		else if(tries == 10) {
			System.out.println("Aha! You know the secret");
		}
		
		else if(tries > 10) {
			System.out.println("You should be able to do better");
		}
	}
	
	
			public static void main(String[] args) {
				
				GuessingGame.guessNumber();
			}
		
	}
	

