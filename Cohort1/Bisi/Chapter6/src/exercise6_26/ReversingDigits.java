package exercise6_26;
import java.util.Scanner;
public class ReversingDigits {
	
	public static void reversingDigits(int number){
		String store = " ";
		int remainder = 0;
		
		
		while(number != 0) {
			
			remainder = number % 10;
			store = remainder + " "+ store;
			
			number = number / 10;
			
			System.out.print(remainder);
		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter numbers");
		int number = in.nextInt();
		
		ReversingDigits.reversingDigits(number);
	}

}
