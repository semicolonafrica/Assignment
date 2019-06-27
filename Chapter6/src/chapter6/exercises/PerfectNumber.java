package chapter6.exercises;

import java.util.Scanner;

public class PerfectNumber {

	public static boolean isPerfect(int number) {
		boolean status = false;
		int sum = 0;

		for (int counter = 1; counter < number; counter++) {
			int remainder = number % counter;

			if (remainder == 0) {
				sum = sum + counter;
			}

			if (sum == number) {
				status = true;
			} 
			else {
				status = false;
			}
		}
		return status;
	}

	public static void displayPerfectNumbers(int number) {

		int sum = 0;
		int remainder = 0;
		int perfect = 0;
		int counter;

		for (counter = 1; counter < number; counter++) {
			remainder = number % counter;

			if (remainder == 0) {
				sum = sum + counter;
				if ((isPerfect(number) == true))
					System.out.printf("%d ", counter);
			}
		}

		if (sum == number)
			perfect = number;

		if (perfect != 0) {
			System.out.printf("%20d%n", perfect);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number");
		int numb = input.nextInt();

		System.out.printf("%s%30s%n", "Multiples", "Perfect Number");
		for (int i = 1; i <= numb; i++)
			displayPerfectNumbers(i);

	}

}