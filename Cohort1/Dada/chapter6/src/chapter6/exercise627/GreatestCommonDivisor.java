package chapter6.exercise627;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public void gcd() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first nmuber or -1 to quit: ");
		int firstNumber = input.nextInt();
		int temp = 0;
		while(firstNumber != -1) {
		
			System.out.print("Enter second number: ");
			int secondNumber = input.nextInt();
			
			
			for(int i = 2; i < firstNumber; i++) {
				if(firstNumber % i ==0 && secondNumber % i == 0)
					temp = i;	
			}
			System.out.println(temp);
			System.out.print("Enter first nmuber or -1 to quit: ");
			firstNumber = input.nextInt();
			
			
			
			if(firstNumber == -1) {
				System.out.println("You have exit the application");
			}
			
		}
		
		
		
		
	}

}
