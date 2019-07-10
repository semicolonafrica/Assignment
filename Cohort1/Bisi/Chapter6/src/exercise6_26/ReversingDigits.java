package exercise6_26;
import java.util.Scanner;
public class ReversingDigits {
	
	public static void reverseDigits(){		

		Scanner in = new Scanner(System.in);
		
		String store = " ";		int remainder = 0;	
		
		System.out.print("Enter values");
		int value = in.nextInt();
				
		while(value != 0) {			
			remainder = value % 10;
			store = remainder + " " + store;			
			value = value / 10;
			
			System.out.print(remainder);
		}
	}
public static void main(String[] args) {
		
	ReversingDigits.reverseDigits();
	}

}
