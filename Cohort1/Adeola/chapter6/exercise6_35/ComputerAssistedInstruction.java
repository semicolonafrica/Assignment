package exercise6_35;
import java.security.SecureRandom;
import java.util.Scanner;
public class ComputerAssistedInstruction {
	static SecureRandom random = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	public static void generateQuiz() {
		int a =1 + random.nextInt(20);
		int b =1 + random.nextInt(20);
		System.out.println("what is the product of "+ a +" and " + b);
		int answer = a*b;
		int response = 0;
		while(answer != response) {
			System.out.print("please enter your answer: ");
			response = input.nextInt();
			if(response == answer) {
				System.out.println("brilliant, you got it");
			}
			else {
				System.out.println("No. Please try again, you can do it");
			}
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateQuiz();
	}
}
