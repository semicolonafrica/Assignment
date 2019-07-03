package exercise6_27;
import java.util.Scanner;
public class GreatestCommonDivisor {
	static Scanner input = new Scanner(System.in);
	public static void gcd() {
		System.out.println("enter the 2 numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int lowest = Math.min(num1, num2);
		for(int i =lowest; i>=1; i--) {
			if((num1%i==0)&&(num2%i==0)) {
				System.out.print(i);
				break;
			}
		}		
	}

	public static void main(String[] args) {
		gcd();
	}

}
