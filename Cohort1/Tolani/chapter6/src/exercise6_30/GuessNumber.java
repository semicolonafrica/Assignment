package exercise6_30;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber {
	
	static SecureRandom random = new SecureRandom();
	
	static int randomNumber = 1 + random.nextInt(1000);
	
	public static void guessANumber() {	
		int count =1;
		Scanner insert = new Scanner(System.in);
		
		System.out.println("Guess a number between 1 and 1000 : ");
		
		int number = insert.nextInt();
		
		while(number != -1) {
		System.out.println(checkRandomNumber(number));
		number = insert.nextInt();	
		count++;	
//		if(count<=10 ||checkRandomNumber(number)=="Too high. Try again" ||checkRandomNumber(number)=="Too low. Try again" ) {
//			System.out.println("Either you know the secret or you got lucky!");
//		 }
//		else if(count == 10 && checkRandomNumber(number) == "Congratulation") {
//			System.out.println("Aha! You know the secret!");
//		 }else if(count>=10 ||checkRandomNumber(number)=="Too high. Try again" ||checkRandomNumber(number)=="Too low. Try again") {
//			 System.out.println("You should be able to do better");
//		 }
		}	
		
		insert.close();
	
		
	}
	
	public static String checkRandomNumber(int number) {
		String result = "";
		
		if(randomNumber == number) {
			
			result ="Congratulations.";
			System.out.println("Guess a number to continue or enter -1 to exit");
		
		}else if(number>randomNumber) {	
		
			result ="Too high. Try again";
		}else if(number< randomNumber) {
			
			result ="Too low. Try again";
			
		}
		
		return result;
	}
	
	

}
