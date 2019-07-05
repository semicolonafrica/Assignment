package exercise637;
import java.security.SecureRandom;
import java.util.Scanner;


public class ModifiedCAI {
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
	public static void displayRemark() {
		
		int reply;
		int count = 5;
		int pass = 0;
		for(int i = 1; i <= count; ++i) {
			int result = multiply();
			System.out.println("How much is " + num1+ "times " + num2);
			reply = input.nextInt();
			if(result != reply) {
				wrongRemark();
			}else {
				 rightRemark();
				 pass = pass + 1;
		}
		
		
	}
	
	double percentage = (pass/count)*100;
	if(percentage <75) {
		System.out.println(percentage +"% Please ask your teacher for extra help" );
		displayRemark();
	}
	else {
		System.out.println(percentage +"% you are ready to go to the next level!.");
		displayRemark();
	}
	}
		
	public static void main(String[] args) {
		displayRemark();
	}

}
