/**
 * 
 */
package Chapter6Exercise635;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Olayinka Oloko
 *
 */
public class ComputerAssistedInstrustion {

	static SecureRandom random= new SecureRandom();
	static Scanner input = new Scanner(System.in);
	static int a = 0;
	static int b = 0;
	public static int multiply() {
		 a = 1 + random.nextInt(9);
		 b = 1 + random.nextInt(9);
		System.out.println("what is the answer of "+ a+ " times " + b);
		int result = a*b;
		return result;
	}
	
	public static void displayRemark() {
		int result = multiply();
		System.out.println("");
		int response = 0;
		while(result != response) {
		 	
		 	response = input.nextInt();
		 	if (result != response){
		 		System.out.println("no, please try again");
		 	}
		 
			 //System.out.println("very good");
		 displayRemark();
		 }
	}
	
	public static void main(String []args) {
		displayRemark();
	}
}
 