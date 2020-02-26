package exercise6_30;
import java.security.SecureRandom;
import java.util.Scanner;
public class NumberGuess {
	SecureRandom randomNumbers = new SecureRandom();
	private enum Status {LOW, HIGH, WIN};
	static int guess;
	static int value;
	static int high;
	static int low;
	static int tries = 0;
	
	
	public void guessNum() {
		
		int menu = 1;
		Status gameStatus;
		
		Scanner input  = new Scanner(System.in);
		System.out.println("Guess Number between 1 and 1000: ");
		
		
		 value = 1 + randomNumbers.nextInt(10);
//		 while(menu == 1) {
//			 System.out.print("Enter 1 to continue: ");
//			 guess = input.nextInt();
//			 break;
//	 }
		 while(guess != value ) {
			 guess = input.nextInt();
			 if(guess < value) {
				 gameStatus = Status.LOW;
				 System.out.println("Too low. Try again");

			 }else if(guess > value) {
				 gameStatus = Status.HIGH;
				 System.out.println("Too High. Try again");
				 
			 }else if(guess == value){
				 gameStatus = Status.WIN;
				 System.out .println("Congratulations. You guessed the number!");	 
			 }
                 tries++;
		 }
		 
		
		 if(tries <= 10) {
			 System.out.println("Either you know the secret or you got lucky");
		 }
		 if(tries == 10) {
			 System.out.println("Aha! You know the secret!");
		 }
		 if(tries > 10) {
			 System.out.println("You should be able to do better");
		 }
	
		 
	}
}
	

