package chapter6;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number to check Prime: ");
		int number = input.nextInt();
		
		System.out.print(PrimeNumber.isPrimeHalf(number));
		System.out.print(PrimeNumber.isPrimeRoot(number));
		System.out.println();
		PrimeNumber.displayPrimeHalf();
		PrimeNumber.displayPrimeRoot();
		input.close();
	}

}
