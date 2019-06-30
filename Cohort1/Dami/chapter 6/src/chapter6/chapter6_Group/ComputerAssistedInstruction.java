package chapter6.chapter6_Group;
// A multiplication question and answer system for school Children by @DamiDrevid
// Import SecureRandom and Scanner
import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
	int anwwer;
	int result;
		
	public static int multiply() {
		SecureRandom rando = new SecureRandom();
		Scanner input = new Scanner(System.in);
		
// Declaring the two variables and initializing them with random numbers	
		int first = rando.nextInt(12);
		int second = rando.nextInt(12);

// Multiplying and storing the result
		int result = first * second;
		
//Displaying question and prompting for answer.		
		System.out.printf("%s%d%s%d%n", "What is the product of ", first, " times ", second);
		System.out.println("Type your answer");
		int answer = input.nextInt();
		
// Comparing result and the answer provided by student
		if (answer == result) {
			System.out.println("Very good!");
		}
		else {
			for( ; answer != result ; ) {
				System.out.println("No, please take your time and try again");
				answer = input.nextInt();
			}
		}
		return result;
	}
	
	public static void doAgain() {
		ComputerAssistedInstruction.multiply();
		while(answer == result) {
			
		}
	}


public static void main(String[] args) {
	ComputerAssistedInstruction.doAgain();
}
}

