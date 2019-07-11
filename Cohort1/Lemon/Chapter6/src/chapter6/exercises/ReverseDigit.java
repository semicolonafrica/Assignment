package chapter6.exercises;

import java.util.Scanner;

/**
 * @author LEMON
 *
 */
public class ReverseDigit {

	
	public static void getReverse(int number) {
		
		int value = number % 10;
		int remainder = number / 10;
		int value1 = remainder %10;
		remainder = remainder / 10;
		int value2 = remainder %10;
		remainder = remainder / 10;
		int value3 = remainder % 10;
		System.out.printf("%d %s %d %d %d %d%n",number,"reverse is",value,value1,value2,value3);
		
	}		
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter 4 digit number you want to reverse");
			int numb = input.nextInt();
			
			getReverse(numb);
	}
}