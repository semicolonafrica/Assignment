package chapter6.exercise6_26;
import java.util.Scanner;

public class ReversingNumber {
	public static void reverseNumber() {

		Scanner input = new Scanner(System.in);		
		
		System.out.println("enter number");
		 int number = input.nextInt();
		 
	System.out.println(ReversingNumber.reverseNumber(number));
		 
		 
	}

	public static int reverseNumber( int number) {

	
	int reverse = 0;
	
	
	while(number != -1) {
	
	 reverse = reverse * 10;
	 reverse = reverse + number % 10;
	 number /= 10;
	  
	}
	return reverse;
	

	}

}
