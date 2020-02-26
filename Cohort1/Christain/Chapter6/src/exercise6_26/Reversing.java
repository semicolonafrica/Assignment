package exercise6_26;
import java.util.Scanner;
public class Reversing {
	public void reverse() {
		Scanner input =  new Scanner(System.in);
		int reverse = 0;
		System.out.print("Enter Number: ");
		int number = input.nextInt();
		
		while(number != 0) {
		 reverse *= 10;
		 reverse += number % 10;
		 number /= 10;
		}
		 System.out.println("Reverse of the number is " + reverse);
	}
}
