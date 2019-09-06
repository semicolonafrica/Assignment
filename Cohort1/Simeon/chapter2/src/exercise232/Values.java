package exercise232;

import java.util.Scanner;

public class Values {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int a;
		int b;
		int negative = 0;
		int positive = 0;
		int zero = 0;
		
		System.out.print("Enter first number: ");
		x = input.nextInt();
		
		System.out.print("Enter second number: ");
		y = input.nextInt();
		
		System.out.print("Enter third number: ");
		z = input.nextInt();
		
		System.out.print("Enter fourth number: ");
		a = input.nextInt();
		
		System.out.print("Enter fifth number: ");
		b = input.nextInt();
		
		if (x < 0)
			negative = negative + 1;
		if (x == 0)
			zero = zero + 1;
		if (x > 0 )
			positive = positive + 1;
		
		if (y < 0)
			negative = negative + 1;
		if (y == 0)
			zero = zero + 1;
		if (y > 0 )
			positive = positive + 1;
		
		if (z < 0)
			negative = negative + 1;
		if (z == 0)
			zero = zero + 1;
		if (z > 0 )
			positive = positive + 1;
		
		if (a < 0)
			negative = negative + 1;
		if (a == 0)
			zero = zero + 1;
		if (a > 0 )
			positive = positive + 1;
		
		if (b < 0)
			negative = negative + 1;
		if (b == 0)
			zero = zero + 1;
		if (b > 0 )
			positive = positive + 1;
		
		System.out.printf("Number of Positive numbers input: %d%n", positive);
		System.out.printf("Number of Negative numbers input: %d%n", negative);
		System.out.printf("Number of zeros input: %d%n", zero);
		
		input.close();
	}

}
