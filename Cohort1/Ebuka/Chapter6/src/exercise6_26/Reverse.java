package exercise6_26;

// @author CHIMA CHUKWUEBUKA
 
import java.util.Scanner;
public class Reverse {
	

	public static int reverse(int num) {
		int x;
		int y = 0;
		
		while(num > 0) {
			x = num %10;
			y = y * 10 + x;
			num = num / 10;
		}
		return y;
	}
	
	public static void main(String [] args) {
		Scanner rev = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = rev.nextInt();
		
		System.out.println("Reversed Number: " + reverse(num));		
	}
}