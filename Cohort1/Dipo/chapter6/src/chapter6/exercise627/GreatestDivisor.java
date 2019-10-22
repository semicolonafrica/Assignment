package chapter6.exercise627;
import java.util.Scanner;
public class GreatestDivisor {
	
	public static void gcd() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int number1 = input.nextInt();
		System.out.println("Enter second number: ");
		int number2 = input.nextInt();
		
		System.out.println("The greatest common divisor is " +gcd(number1, number2));
	}
	
	public static int gcd(int a, int b) {
		
		if(b == 0)
			return a;
		
		int c = a % b;
		
		return gcd(b, c);
	}

}
