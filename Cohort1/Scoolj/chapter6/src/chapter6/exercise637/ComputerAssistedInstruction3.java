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
		int pass =0;
		int fail =0;
		
		// this iterate through d questions.
		for (int i = 1;  i <=5; i++) {
			int findProduct = calculateProduct();
			int response =0;
			response = input.nextInt();
			if (findProduct == response) {
				int comment = commentPass(); 
				pass ++;
				System.out.println(pass);
				
		}
			else {
		
		// pass remark based on incorrect response
		int comment = commentFail();	
			fail++;
			System.out.println(fail);
		}
		}
		
		pass = (pass/10)*100;
		
		if (pass >= 75) {
		System.out.printf("%d % %s",pass, "Congratulations, you are\r\n" + 
				"ready to go to the next level!");
		}
		else {
			
			System.out.printf("%d % %s",pass, "Please ask your teacher for extra\r\n" + 
					"help.");
		}
	
		return pass;
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
