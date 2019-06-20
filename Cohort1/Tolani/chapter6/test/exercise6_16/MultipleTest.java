package exercise6_16;

import java.util.Scanner;

public class MultipleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner insert = new Scanner(System.in);
		System.out.println("Enter first value: ");
		int first = insert.nextInt();
		System.out.println("Enter second value: ");
		int second = insert.nextInt();
		System.out.println(Multiple.isMultiple(first, second));
		
		insert.close();
	}

}
