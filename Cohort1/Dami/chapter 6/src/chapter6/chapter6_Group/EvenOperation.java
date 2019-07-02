package chapter6.chapter6_Group;
import java.util.Scanner;
public class EvenOperation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers would you be working on?");
		int counter = input.nextInt();
		
		for(int i = 1; i <= counter; i++) {
			System.out.println("What's your number?");
			int x = input.nextInt();
			
		int test = EvenUtil.isEven(x);
			
		}
	}

}
