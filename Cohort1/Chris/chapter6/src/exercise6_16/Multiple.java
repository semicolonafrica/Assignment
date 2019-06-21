package exercise6_16;
import java.util.Scanner;
public class Multiple {
	
	public static boolean isMultiple(int num1, int num2) {
		if(num2 % num1 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter first integer: ");
		int first = input.nextInt();
		
		System.out.printf("Enter second integer: ");
		int second = input.nextInt();
		
		System.out.printf("%nyour result is %b", isMultiple(first, second));
	}

}
