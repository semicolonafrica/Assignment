package chapter6.exercise69;

import java.util.Scanner;

public class RoundingNumbersTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		RoundingNumbers obj = new RoundingNumbers();
		
		System.out.print("How many numbers do you want to process?");
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.print("number: ");
			double x = input.nextDouble();
			
			System.out.println("Original number is: "+ x);
			System.out.println("Rounded number is: "+ obj.calculateRoundnumber(x));
			}
	}
}
