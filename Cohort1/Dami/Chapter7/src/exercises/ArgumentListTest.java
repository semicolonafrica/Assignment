package exercises;

import java.util.Scanner;

public class ArgumentListTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] ola = new int[10];
		int number;
		
		for(int a = 0; a < ola.length; a++) {
			System.out.println("Enter numbers");
			number = input.nextInt();
			
			ola[a] = number;
		}
		input.close();
		System.out.printf("%,d%n", ArgumentList.calcProduct(ola));
		
	}

}
