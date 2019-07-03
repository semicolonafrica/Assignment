package exercise6_21;

import java.util.Scanner;
public class SeparateDigitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number : ");
		int digit = input.nextInt();
		
		System.out.println(SeparateDigit.diplayDigit(digit));
		input.close();
	}

}
