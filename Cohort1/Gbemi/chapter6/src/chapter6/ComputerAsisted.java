package chapter6;
/**
 * @author gbemi
 *
 */
import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAsisted {
	
	static SecureRandom random = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	
	static int a =0;
	static int b =0;
	
	//method to multiplies
	public static int multiply() {
		a = 1 + random.nextInt(9);
		b = 1 + random.nextInt(9);
		int result = a*b;
		return result;
	}
	
	//method to displays remark
	public static void displayRemark() {
		int result = multiply();
		int response = 0;
		for(int i=0;i<5;i++) {
		while(result != response) {
			System.out.println("what is the result of " + a+ " times "+ b);
			response = input.nextInt();
			if(result != response) {
				System.out.println("no, please try again");
			}
		}
		}
		System.out.println("very good");
		//call method to change question
		displayRemark();
	}
	public static void main(String[] args) {
		// call method displayRemark
		displayRemark();
	}
}