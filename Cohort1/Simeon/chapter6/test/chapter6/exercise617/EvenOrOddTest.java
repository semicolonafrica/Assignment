package chapter6.exercise617;

import java.util.Scanner;

public class EvenOrOddTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int digit;
		
		for(int k = 1; k <= 10; k++) {
	
			System.out.println("Enter any Numbers: ");
			digit = input.nextInt();
			
			System.out.println(EvenOrOdd.isEven(digit));

		}
		
		input.close();

	}


}
