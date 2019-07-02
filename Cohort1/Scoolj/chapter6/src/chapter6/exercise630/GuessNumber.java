package chapter6.exercise630;
import java.util.Scanner;
import java.security.SecureRandom;
public class GuessNumber {
	static SecureRandom randomNumber = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	static 	int randomStore =0;
	static int guessNumberGame =0;
	public static int  findGuessNumber() {
		
		System.out.println("Menu"+ "\n"+ " press 1 to continue"+"\r \t" +"press 0 to stop");
		int menu = input.nextInt();
		
		if (menu == 1) {
			
			System.out.println ("Enter guess Number");
			int guessNumber = input.nextInt();
			randomStore = randomNumber();
			guessNumberGame = calculateGuessNumber(guessNumber);	
		}
		else if( menu == 0) {
				System.exit(0);
		}
		return guessNumberGame;
	}
	
	public static int calculateGuessNumber(int guessNumber) {
		 int counter=0;

		 System.out.println(randomStore);
// this is use to compare guessNumber and randomvalue and also to void being iterated in the loop
				if (guessNumber == randomStore) {
						System.out.println("Congratulation.You guess number");
						
						}
 //      this is use to toggle in search of match between guessNumber and randomStore number
		 while ( guessNumber > randomStore || guessNumber < randomStore) {
			
						if  (guessNumber > randomStore) {
							System.out.println("Too high. try Again");
						}
						else if  (guessNumber < randomStore) {
							System.out.println(" Low high. try Again");
					}
	//  this is you to represent input prompt to user at the end of every iteration
						System.out.println ("Enter guess Number"); 
						guessNumber = input.nextInt();
		
						counter++;
						// this is use to recall method at the end of iteration
						guessNumber= calculateGuessNumber(guessNumber); 
						
 
		}
		return guessNumber;
	}
	
	public static  int randomNumber() {
		
		int  randomValue = 1 + randomNumber.nextInt(1000);
		
		return randomValue;
	}
}
