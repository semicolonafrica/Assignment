package exercise635;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {
	static SecureRandom random = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	
	static int num1 = 0;
	static int num2 = 0;
	public static int multiply() {
		num1 = 1 + random.nextInt(9);
		num2 = 1 + random.nextInt(9);
		int result = num1 * num2;
		return result;
	}
	
	public static void displayremark() {
		int result = multiply();
		int reply = 0;
		while (result != reply) {
			System.out.println("How much is " + num1+ "times " + num2);
			reply = input.nextInt();
			if(result != reply) {
				System.out.println("No. Please try again. ");
				
			}else {
				System.out.println("Very good! ");
			}
			
		}
	}
	
	

	public static void main(String[] args) {
		CAI.displayremark();

	}

}
