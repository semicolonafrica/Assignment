package chapter6.exercise631;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumberModification {
	static SecureRandom randomNumber = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	static 	int randomStore =0;
	static int guessNumberGame =0;
	static int counterD =0;
	public static int  findGuessNumber() {
		
		System.out.println("Menu"+ "\n"+ " press 1 to continue"+"\r \t" +"press 0 to stop");
		int menu = input.nextInt();
		
		if (menu == 1) {
			
			System.out.println ("Enter guess Number");
			int guessNumber = input.nextInt();
			randomStore = randomNumber(); //  this makes secureRandom to be call once throughout the program execution
			guessNumberGame = calculateGuessNumber(guessNumber);	
		}
		else if( menu == 0) {
				System.exit(0);
		}
		return guessNumberGame;
	}
	
	public static int calculateGuessNumber(int guessNumber) {
		 int counter=0;
		 
		 System.out.println(randomStore + "\t "+counterD);
		 
// this is use to compare guessNumber and randomvalue and also to void being iterated in the loop
				if (guessNumber == randomStore) {
						System.out.println("Congratulation.You guess number");
						
						}
 //      this is use to toggle in search of match between guessNumber and randomStore number
		 while ( guessNumber > randomStore || guessNumber < randomStore )  {
			 
						if  (guessNumber > randomStore) {
							System.out.println("Too high. try Again");
							
						}
						else if  (guessNumber < randomStore) {
							System.out.println(" Low high. try Again");
							
					}
	//  this is you to represent input prompt to user at the end of every iteration
						System.out.println ("Enter guess Number"); 
						guessNumber = input.nextInt();
						
						 System.out.println(counter+=counter++);  
						 
						// this is use to recall method at the end of iteration
						guessNumber= calculateGuessNumber(guessNumber); 
						
						
		}
		 
		return guessNumber;
		
	}
	public static int displayCounter(int counterA) {
		int counter =0;
		if (counter == 10) {
			System.out.println("Aha! you know the secret!");
		}
		else if (counter < 10) {
			System.out.println("Either yiu know the secret or you got lucky!");
		}
		else if (counter > 10) {
			System.out.println("You should be able to do better!");
		}
		return counterA;
	}
	
	public static  int randomNumber() {
		
		int  randomValue = 1 + randomNumber.nextInt(1000);
		
		return randomValue;
	}

 
}
