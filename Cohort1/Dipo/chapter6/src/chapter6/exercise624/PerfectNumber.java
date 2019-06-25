package chapter6.exercise624;
import java.util.Scanner;
public class PerfectNumber {

	public static boolean isPerfect() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
		System.out.println();
		 
		int factor = 0;
		int sum = 0;
		
		for(int counter = 1; counter < number; counter++) {
			
			if(number % counter == 0) {
				factor = counter;
				
				System.out.println( factor);
				sum+= factor;
			}
			
			
		}
		System.out.println();
		System.out.println("The sum of factors is: " + sum);
		
		if(sum == number) {
			
			System.out.println();
			System.out.println("True, This is a Perfect Number");
		}
		else {
			System.out.println();
			System.out.println("False, This is not a Perfect Number");
		}
		return true;
	
	}
}
