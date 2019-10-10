package chapter11;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZeroException {
	
	public static int quotient(int numerator, int denominator)
	throws ArithmeticException{
		
		return numerator/denominator;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean continueLoop = true;
		
		
		do {
			try {
				System.out.print("enter an integer numerator");
				int numerator = scanner.nextInt();
				System.out.print("enter an integer denominator");
				int denominator = scanner.nextInt();
				
				
				int result = quotient(numerator, denominator);
				System.out.printf("%nResult: %d / %d = %d%n", numerator,denominator,result);
				
				continueLoop = false;
			}
			catch (InputMismatchException inputMismatchException) {
				System.err.printf("%nException: %s%n", inputMismatchException);
				scanner.nextLine();
				System.out.printf("you must enter an integer,try again!!.%n");
				
			}
			catch (ArithmeticException arithmeticException) {
				
				System.err.printf("%nException: %s%n", arithmeticException);
				
				System.out.printf("Zero is an invalid denominator.try again!!!%n");
				
				
			}
			
		}
			
			while (continueLoop);
		
	}
	

}
