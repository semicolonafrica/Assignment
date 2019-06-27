package chapter6.exercises;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author LEMON
 *
 */
public class GuessNumber {
	static int count = 0;

	public static int getNumber() {
		SecureRandom rand = new SecureRandom();

		int number = 1 + rand.nextInt(1000);

		return number;
	}

	public static void guess(int numb) {
		Scanner input = new Scanner(System.in);
		int value = getNumber();

		do {
			System.out.println("Guess a number between 1 and 1000");
			numb = input.nextInt();


				if (numb == value) {
					System.out.println("Congratulations. You guessed the number!");
					System.out.println(value);
					
					value = getNumber();
					
					if (count == 10) {
						break;
					}
				} 
				else if (numb != value && numb > value) {
					System.out.println("Too high. try again!");
					count++;
					if (count == 10) {
						System.out.println("Ops 10th trial, Game Over!");
						break;
					}
				} 
				else if (numb != value && numb < value) {
					System.out.println("Too low. try again!");
					count++;
					if (count == 10) {
						System.out.println("Ops 10th trial, Game Over!");
						break;
					}
				}			
		}
		while (numb != 0);
		System.out.print(value);		
	}
	public static void main(String[] args) {
		guess(0);
	}
}