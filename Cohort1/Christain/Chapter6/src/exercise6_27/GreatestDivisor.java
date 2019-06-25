package exercise6_27;
import java.util.Scanner;
public class GreatestDivisor {
	public void gcd() {
		Scanner input = new Scanner(System.in);
		int divisor = 1;
		System.out.print("Enter First Number: ");
		int num = input.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = input.nextInt();
		
		for(int i = 1; i <= num && i <= num2; i++) {
			
			if(num % i == 0 && num2 % i == 0)
				divisor = i;
		}
			System.out.printf("GCD of %d and %d is: %d", num, num2, divisor);
	}
}
