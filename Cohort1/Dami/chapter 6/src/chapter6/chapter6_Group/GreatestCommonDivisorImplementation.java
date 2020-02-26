package chapter6.chapter6_Group;
import java.util.Scanner;
public class GreatestCommonDivisorImplementation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = input.nextInt();
		
		System.out.println("Enter second number");
		int b = input.nextInt();
		
		System.out.printf("%d%n", GreatestCommonDivisor.gcd(a, b))
		
		;		
		
	}

}
