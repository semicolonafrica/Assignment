package chapter5.exercise513;
import java.util.Scanner;
public class ArithmeticTest {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the store initial value");
		long keep = input.nextLong();
		
		System.out.print("Enter the number of factorial");
		int factorial = input.nextInt();
		
		
		Arithmetic dipo = new Arithmetic(keep, factorial);
		
		System.out.printf("%s\t%s%n%n", "Count", "Factorial");
		
		dipo.calculateFactorial();
	}
}
