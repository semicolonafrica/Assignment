package Chapter6.exercise6_26;

import java.util.Scanner;

	public class ReversedIntegerTest{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any digit between 1 and 999999: ");
		int num = input.nextInt();
		
		
		ReversedInteger.reverseInteger(num);


	}

}
