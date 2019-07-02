package exercise6_16;

import java.util.Scanner;
public class MultipleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int number2 = input.nextInt();

		System.out.println(Multiple.isMultiple(number1, number2));
		
		input.close();
	}

}
