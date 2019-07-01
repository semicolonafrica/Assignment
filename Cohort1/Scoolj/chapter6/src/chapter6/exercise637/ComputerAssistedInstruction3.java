/**
 * 
 */
package chapter6.exercise637;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Scoolj,Oluwajuwonlo
 *
 */
public class ComputerAssistedInstruction3 {
	
	static SecureRandom randomNumber = new SecureRandom();
	static Scanner input = new Scanner(System.in);
 
	static double status = 0.0;
		// this method generate random number
	public static int calculateProduct() {
	int randomDigit1 = 1 + randomNumber.nextInt(12);
	int  randomDigit2= 1 + randomNumber.nextInt(12);
	
	System.out.println(" How much is   "+ randomDigit1 + "   times   "+ randomDigit2 );
	
		int  product = randomDigit1 * randomDigit2;
		
		return product;
	}
	// this method makes decision based on input

	public static int findMultiplication() {
		double pass =0;
		double fail =0;
		double counter= 0;
		int response =0;
		
		// this iterate through d questions.
		for (counter= 1; counter <=10; counter++) {
			
			int findProduct = calculateProduct();
				response = input.nextInt();
			if (findProduct == response) {
				commentPass(); 
				 pass ++;
				System.out.println(pass);
 
					}
			else {
		
			// pass remark based on incorrect response
			commentFail();	
			fail++;
			System.out.println(fail);
	
				}	
		
		}
		calculatePercent(pass, fail, counter);
		
			return response;
		
	}
	
	public static double calculatePercent(double pass, double fail, double counter) {
		
		 status = (pass/counter) * 100;
 
		if (status >= 75) {
			System.out.printf(" %.2f%s ",status,"%  Congratulations, you are ready to go to the next level!");
		}
		else {
			System.out.printf(" %.2f%s ",status,"%   Please ask your teacher for extra help.");
		}
		
		return status;
	}

// this method stores fail remarks
public static int commentFail() {
	
	int commentFail = 1 + randomNumber.nextInt(3);
 
 switch (commentFail) {
 case 1:
	 System.out.println(" No. Please try again!");
	 break;
 case 2:
	 System.out.println( "Wrong. Try once more!");
	 break;
 case 3:
	 System.out.println("Don’t give up!");
	 break;
 case 4:
	 System.out.println(" No. Keep trying!");
	 break;
 }
 
 	return commentFail;
	 
 }
 // this method stores pass remark
 public static int commentPass() {
	 
	 int commentPass = 1 + randomNumber.nextInt(3);
	 
 	 switch (commentPass) {
	 case 1:
		 System.out.println(" very good! ");
		 break;
	 case 2:
		 System.out.println(" Excellent! ");
		 break;
	 case 3:
		 System.out.println(" Nice work! ");
		 break;
	 case 4:
		 System.out.println(" Keep up the good work! ");
		 break;
	 }
return commentPass;

}

}
