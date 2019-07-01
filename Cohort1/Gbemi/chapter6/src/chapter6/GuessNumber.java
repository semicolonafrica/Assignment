/**
 * 
 */
package chapter6;

/**
 * @author User
 *
 */
import java.util.Scanner;
import java.security.SecureRandom;
public class GuessNumber {
	public static void guessNumber(int number) {
		
		Scanner input =new Scanner(System.in);
		
		SecureRandom randomNumbers= new SecureRandom();
		
		//for (int counter=1;counter<=20;counter++) {
			
			 number= 1+ randomNumbers.nextInt(20);
			 int counter=1;
			 int value=1;
			 System.out.println("enter the number you want to guess");
			 
			 		while(number!=value) {
			 			
				
				 value=input.nextInt();
				
				if(value==number) {
					System.out.println(" congratulation");
					//break;
				}
				else if(value<number) {
					System.out.println("Too low. Try again");
					
					//System.out.println(number);
				}
				else if(value>number) {
					System.out.println("Too high. Try again");
					//System.out.println(number);
					}
				
				counter++;
		}
			 		
			 		if (counter<=10) {
			 			System.out.println("you got lucky");
			 			
			 		}
			 		else {
			 			System.out.println("You should be able to do better");
			 		}
			 		
		}
		
	
	
	public static void main(String[] args) {
		guessNumber(200);
	}

}
