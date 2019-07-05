package exercise636;
import java.security.SecureRandom;
import java.util.Scanner;

public class ReducingStudentFatigue {
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
	
	public static void wrongRemark() {
		int wrongAnswer = 1 +random.nextInt(4);
		
		switch(wrongAnswer) {
		
		case 1:
			System.out.println("No. Please try again.");
			break;
			
		case 2:
			System.out.println("Wrong. Try once more.");
			break;
			
		case 3:
			System.out.println("Don't give up!");
			break;
			
		case 4:
			System.out.println("No. Keep trying.");
		
		
		}
//		
		
	}
	public static void rightRemark() {
		int rightAnswer = 1 + random.nextInt(4);
		
		switch(rightAnswer) {
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
			System.out.println("Keep up the good work!.");
		
		}
		
	}
	public static void displayremark() {
		int result = multiply();
		int reply = 0;
		while (result != reply) {
			System.out.println("How much is " + num1+ "times " + num2);
			reply = input.nextInt();
			if(result != reply) {
				wrongRemark();
			}
			
		}
		 rightRemark();
		 
		 displayremark();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayremark();

	}

}
