package exercise6_27;

import java.util.Scanner;

public class GCDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner insert = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		int num1 = insert.nextInt();
		
		System.out.println("Enter number: ");
		
		int num2 = insert.nextInt();
		
		
		System.out.println(GCD.findGCD(num1, num2));
		
		
	}

}
