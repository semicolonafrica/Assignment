package chapter2.exercise2_15;
import java.util.Scanner;
//
//Write an application that asks the user to enter two integers, obtains them
//from the user and prints their sum, product, difference and quotient (division). Use the techniques
//shown in Fig. 2.7.

public class Arithemetic {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("enter number");
		number1 = input.nextInt();
		System.out.println("enter number");
		number2 = input.nextInt();
		
		int sum = number1 + number2;
		int product = number1 + number2;
		int diff = number1 - number2;
		int div = number1 / number2;
		
		System.out.printf("sum is: %d%nProuct is: %d%ndiff is: %d%ndiv is: %d%n", sum,product,diff,div);
		

	}

}
