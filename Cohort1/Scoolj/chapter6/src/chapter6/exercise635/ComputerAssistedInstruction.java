/**
 * 
 */
package chapter6.exercise635;
import java.util.Scanner;
import java.security.SecureRandom;
/**
 * @author Scoolj, Oluwajuwonlo Joseph
 *
 */
public class ComputerAssistedInstruction {
	static SecureRandom randomNumber = new SecureRandom();
	static Scanner input = new Scanner(System.in);
 
	private static int randomDigit1 = 0;
	private static int	randomDigit2 = 0;
	 
		
	public static int calculateProduct() {
	randomDigit1 = 1 + randomNumber.nextInt(12);
	randomDigit2 = 1 + randomNumber.nextInt(12);		
		int  product = randomDigit1 * randomDigit2;
		
		return product;
	}

public static int findMultiplication() {
		int findProduct = calculateProduct();
		int response =0;
		while (findProduct != response) {
			System.out.println(" How much is   "+ randomDigit1 + "   times   "+ randomDigit2 );
			response = input.nextInt();
			if (findProduct != response) {
			System.out.println("No, please try again!");
		}
		}
		
		System.out.println("very good!");
		findMultiplication();

	
		return findProduct;
	}

	}		
 