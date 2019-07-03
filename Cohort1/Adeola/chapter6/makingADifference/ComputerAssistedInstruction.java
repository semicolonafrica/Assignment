package makingADifference;
//import securerandom and scanner
import java.security.SecureRandom;
import java.util.Scanner;
public class ComputerAssistedInstruction {
	
	static SecureRandom random = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	
	static int a =0;
	static int b =0;
	
	//method that multiplies
	public static int multiply() {
		a = 1 + random.nextInt(9);
		b = 1 + random.nextInt(9);
		int result = a*b;
		return result;
	}
	
	//method that displays remark
	public static void displayRemark() {
		int result = multiply();
//		System.out.println("");
		int response = 0;
		while(result != response) {
			System.out.println("what is the answer of " + a+ " times "+ b);
			response = input.nextInt();
			if(result != response) {
				System.out.println("no, please try again");
			}
		}
		System.out.println("very good");
		//call method 
		displayRemark();
	}

	public static void main(String[] args) {
		// call method displayRemark
		displayRemark();
	}

}
