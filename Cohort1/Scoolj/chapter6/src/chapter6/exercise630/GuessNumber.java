package chapter6.exercise630;
import java.util.Scanner;
import java.security.SecureRandom;
public class GuessNumber {
	static SecureRandom randomNumber = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	static 	int randomValue =0;
	static int guessNumberGame =0;
	public static int findGuessNumber() {

	
		System.out.println("Menu"+ "\n"+ " press 1 to continue"+"\r \t" +"press 0 to stop");
		int menu = input.nextInt();
		
		if (menu == 1) {
			
			guessNumberGame = randomNumber();
		}
		else if( menu == 0) {
			System.exit(guessNumberGame);
		}
		
		
		return  guessNumberGame;
	}
	
	
	public static  int randomNumber() {
		
		 randomValue = 1 + randomNumber.nextInt(1001);

		System.out.println("Enter guess Number");
		int  guessNumber = input.nextInt();
		
		guessNumber =calculateGuessNumber(guessNumber);
		return guessNumber;
		 
		
	}
 
	
	public static int calculateGuessNumber(int guessNumber) {

		 System.out.println(randomValue);
		 int counter=0;
		while (guessNumber < randomValue || guessNumber > guessNumber) {
	
			if (guessNumber == randomValue) {
				
			System.out.println("Congratulation.You guess number");
//			guessNumberGame = randomNumber();
			
				break;
			}
		 if (guessNumber > randomValue) {
			
			System.out.println("Too high. try Again");
			guessNumberGame = randomNumber();
 
			continue;
		}
		 if (guessNumber > randomValue) {
			System.out.println("Too low. Try again");
			guessNumberGame = randomNumber();
			continue;
		}
		
		counter++;
		}
		return guessNumber;
		
		
	
	
		
		
		
	}
}
