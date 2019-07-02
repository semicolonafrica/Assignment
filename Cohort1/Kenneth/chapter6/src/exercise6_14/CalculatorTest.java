package exercise6_14;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner insert = new Scanner(System.in);
		
		Calculator value = new Calculator();
		
		System.out.print("Enter base: ");
		int base = insert.nextInt();
		
		System.out.print("Enter base: ");
		int exponent = insert.nextInt();
		
		
		System.out.println("The base exponent is " +value.calculateBase(base, exponent));
		
		insert.close();
	}

}
