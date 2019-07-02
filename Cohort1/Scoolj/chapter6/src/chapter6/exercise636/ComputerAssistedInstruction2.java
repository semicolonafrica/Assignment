package chapter6.exercise636;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction2 {

	static SecureRandom randomNumber = new SecureRandom();
	static Scanner input = new Scanner(System.in);
 
	private static int randomDigit1 = 0;
	private static int	randomDigit2 = 0;
	 
		// this method generate random number
	public static int calculateProduct() {
	randomDigit1 = 1 + randomNumber.nextInt(12);
	randomDigit2 = 1 + randomNumber.nextInt(12);		
		int  product = randomDigit1 * randomDigit2;
		
		return product;
	}
	// this method makes decision based on input
public static int findMultiplication() {
		int findProduct = calculateProduct();
		int response =0;
	
		// this makes decision based on wrong response
		while (findProduct != response) {
			System.out.println(" How much is   "+ randomDigit1 + "   times   "+ randomDigit2 );
			response = input.nextInt();
			if (findProduct != response) {
				int comment = commentFail(); ;
		}
		}
		// pass remark based on correct response
		int comment = commentPass();;
		findMultiplication();

	
		return findProduct;
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
