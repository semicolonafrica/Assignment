package exercise6_17;
/* A program that accepts integers in sequence
 * and determines if they are even or odd numbers
 */
import java.util.Scanner;

public class OddOrEven {
	
	public static boolean isEven(int number) {
		
		if(number % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("pick a number! ");
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.print("Enter value:");
			int value = input.nextInt();
			System.out.println(isEven(value));
		}
	}

}
