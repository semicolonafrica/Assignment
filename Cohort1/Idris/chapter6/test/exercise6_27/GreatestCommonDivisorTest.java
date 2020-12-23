package exercise6_27;

import java.util.Scanner;
public class GreatestCommonDivisorTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner accept = new Scanner(System.in);
		
		System.out.println("enter first number: ");
		int number1 = accept.nextInt();
		
		System.out.println("enter second number: ");
		int number2 = accept.nextInt();
		
		GreatestCommonDivisor.calculateGCD(number1, number2);
		accept.close();
	}

}
