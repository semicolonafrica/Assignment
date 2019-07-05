package exercise630;
import java.util.Scanner;
import java.security.SecureRandom;

public class GuessNumber {
	public static void getGuessNum() {
		SecureRandom random = new SecureRandom();
		Scanner input = new Scanner(System.in);
	
		int number ;
		
		
		int temp = 1 + random.nextInt(5);
		System.out.println("Enter the any number between 1 to 1000: ");
		
		do {
			
			number = input.nextInt();
//			guess++;
			if(number > temp) 
				System.out.println("Too high please retry other number:" +"  ");
			
			else if(number < temp) 
				System.out.println("Too low please try again: ");
			
				
			
		}while(number != temp);
		System.out.println("Congratulation! you have won my number by this: " + temp );
		
		input.close();
	
	}
	

	public static void main(String[] args) {
//	calling a static method.
		GuessNumber.getGuessNum();

	}

}
