package chapter7;

import java.util.Scanner;

public class VariableNoOfArgumentTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter any numbers \nto calculate product: ");
		int first = input.nextInt();
		int second = input.nextInt();
		int third = input.nextInt();
		int fourth = input.nextInt();
		int fifth = input.nextInt();
		int sixth = input.nextInt();
		int seventh = input.nextInt();
		
		System.out.printf("1. %d%n2. %d%n3. %d%n4. %d%n5. %d%n6. %d%n7. %d%n",
		first,second,third,fourth,fifth,sixth,seventh);
		
		System.out.printf("The product of first two numbers: %d%n", 
		VariableNoOfArgument.product(first,second));	
		
		System.out.printf("The product of first three numbers: %d%n", 
		VariableNoOfArgument.product(first,second,third));
		
		System.out.printf("The product of first four numbers: %d%n", 
		VariableNoOfArgument.product(first,second,third,fourth));
		
		System.out.printf("The product of first five numbers: %d%n", 
		VariableNoOfArgument.product(first,second,third,fourth,fifth));
		
		System.out.printf("The product of first six numbers: %d%n", 
		VariableNoOfArgument.product(first,second,third,fourth,fifth,sixth));
		
		System.out.printf("The product of first seven numbers: %d%n", 
		VariableNoOfArgument.product(first,second,third,fourth,fifth,sixth,seventh));

		input.close();
	}

}
