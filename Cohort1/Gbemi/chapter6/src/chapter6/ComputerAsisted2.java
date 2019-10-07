package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author gbemi
 *
 */
public class ComputerAsisted2 {
	
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
	// method for wrong remarks
	public static void wrongRemark() {
		int wrong = 1 + random.nextInt(4);
		
		switch(wrong) {
			case 1:
				System.out.println("no, please try again");
				break;
			case 2:
				System.out.println("wrong, try once more");
				break;
			case 3:
				System.out.println("don't give up");
				break;
			case 4:
				System.out.println("no keep trying");
				break;
			default:
		}
	}
	// method for right remarks
	public static void rightRemark() {
		int wrong = 1 + random.nextInt(4);
		
		switch(wrong) {
			case 1:
				System.out.println("Very good!");
				break;
			case 2:
				System.out.println("Excellent!");
				break;
			case 3:
				System.out.println("Nice work!");
				break;
			case 4:
				System.out.println("Keep up the good work!");
				break;
			default:
		}
	}
	
	//method to displays remark
	public static void displayRemark() {
		int result = multiply();
		int response = 0;
		while(result != response) {
			System.out.println("what is the result of " + a+ " times "+ b);
			response = input.nextInt();
			if(result != response) {
				wrongRemark(); // call wrong remark method to display random response
			}
		}
			rightRemark();// call right remark method to display random response
		//call method to change question
		displayRemark();
	}

	public static void main(String[] args) {
		// call method displayRemark
		displayRemark();
	}

}