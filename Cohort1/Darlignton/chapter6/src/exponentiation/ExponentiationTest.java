package exponentiation;
import java.util.Scanner;

public class ExponentiationTest {
	public static void main(String args[]) {
		Operation calculator = new Operation();
		
		
		Scanner input = new Scanner(System.in); //object of scanner
		

		System.out.print("Enter base");
		int base = input.nextInt();
		
		System.out.print("Enter exponent");
		int exponent = input.nextInt();
		
		int x = calculator.getProduct(base, exponent);
		System.out.println(x);
	
		input.close();
		//System.out.println(Exponentiation.integerPower(base, exponent));
	}

}
