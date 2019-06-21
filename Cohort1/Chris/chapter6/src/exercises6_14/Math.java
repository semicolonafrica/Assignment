package exercises6_14;

/*Method that returns the value 
 * of base exponent
 */
import java.util.Scanner;

public class Math {
	
	public static int integerPower(int base, int exponent) {
		
		int power = 1;
		
		for(int i = 1; i <= exponent; i++) {
			power *=base;
		}
			return power;
	}
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter base integer: ");
		int firstInteger = input.nextInt();
		
		System.out.printf("Enter power integer: ");
		int secondInteger = input.nextInt();
		
		System.out.printf("%n%d to the power of %d is: %d%n", firstInteger, secondInteger, integerPower(firstInteger, secondInteger));
		
		
	}

}
