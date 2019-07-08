package chapter6.exercise635;

//import class SecureRandom
import java.security.SecureRandom;

//import class Scanner
import java.util.Scanner;

//class 
public class ComputerAssistedInstruction {
	
	static SecureRandom random = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	
	static int a=0;
	static int b=0;
	
	//method that multiply
	public static int multiply() {
		a = 1 + random.nextInt(9);
		b = 1 + random.nextInt(9);
		//System.out.println("what is the answer of" + a+ " times "+ b);
		int result = a * b;
		return result;
				
	}
	public static void displayRemark() {
		int result = multiply();
		int response = 0;
		while(result !=response) {
			System.out.println("what is the answer of " + a+ " times "+ b);
			response = input.nextInt();
			if(result != response) {
				System.out.println("no, please try again");
			}
		}
		System.out.println("Very good");
		// call method
		displayRemark();
		
	}
	public static void main(String[] args) {
		// call method displayRemark
		displayRemark();
	}
	
	

}
