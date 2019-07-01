package chapter6.chapter6_Group;
// A multiplication question and answer system for school Children by @DamiDrevid
// Import SecureRandom and Scanner
import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
//	int anwwer;
//	int result;

	// Random comment generator for right answers
	public static void getRight() {
			SecureRandom rando = new SecureRandom();
				int comment_a = rando.nextInt(5);
						
				switch(comment_a) {
					case 1:
						System.out.println("Excellent!");
						break;
					case 2:
						System.out.println("Very good!");
						break;
					case 3:
						System.out.println("Nice Work!");
						break;
					case 4:
						System.out.println("Keep up the good work!");
						break;
					default:
						System.out.println("Ose!");
				}
		}
		
// Random comment generator for wrong answers
public static void getWrong() {
			SecureRandom rando = new SecureRandom();
				int comment_a = rando.nextInt(5);
						
				switch(comment_a) {
					case 1:
						System.out.println("No, please take your time and try again");
						break;
					case 2:
						System.out.println("Wrong. Try once more.");
						break;
					case 3:
						System.out.println("Don’t give up!");
						break;
					case 4:
						System.out.println("No. Keep trying.");
						break;
					default:
						System.out.println("OYO");
						}
				}


	public static int multiply() {
		SecureRandom rando = new SecureRandom();
		Scanner input = new Scanner(System.in);
		
// Declaring the two variables and initializing them with random numbers	
		int first = 1 + rando.nextInt(9);
		int second = 1 + rando.nextInt(9);

// Multiplying and storing the result
		int result = first * second;
		
//Displaying question and prompting for answer.		
		System.out.printf("%s%d%s%d%n", "What is the product of ", first, " times ", second);
		System.out.println("Type your answer");
		int answer = input.nextInt();
		
// Comparing result and the answer provided by student
		if (answer == result) {
			ComputerAssistedInstruction.getRight();
		}
		else {
			for( ; answer != result ; ) {
				ComputerAssistedInstruction.getWrong();
				answer = input.nextInt();
			}
			ComputerAssistedInstruction.getRight();
		}
		return result;
	}
	
	public static void doAgain() {
		ComputerAssistedInstruction.multiply();
		for (int i = -1; i < ComputerAssistedInstruction.multiply(); ) {
			
		}
		
	}


	
public static void main(String[] args) {
	ComputerAssistedInstruction.doAgain();
}
}

