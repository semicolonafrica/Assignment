package chapter6.exercises;

import java.util.Scanner;

public class CommonDivisorTest {
	
	public static void main(String[] args) {
		Scanner ops = new Scanner(System.in);
		
		System.out.println("Enter the two values:");
		int value = ops.nextInt();
		int value1 = ops.nextInt();
		
		
		CommonDivisor.checkDivisor(value,value1);
	}

}
