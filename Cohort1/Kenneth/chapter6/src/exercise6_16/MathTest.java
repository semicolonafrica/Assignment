package exercise6_16;

import java.util.Scanner;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner insert = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num1 = insert.nextInt();
		
		System.out.print("Enter number: ");
		int num2 = insert.nextInt();
		
		
		System.out.println(Math.isMultiple(num1,num2));
		
		insert.close();

	}

}
