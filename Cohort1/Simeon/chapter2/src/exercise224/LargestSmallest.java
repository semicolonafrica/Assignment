package exercise224;

import java.util.Scanner;

public class LargestSmallest {

	// main method begins execution of Java Application
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		
		System.out.print("Enter third number: ");
		num3 = input.nextInt();
		
		System.out.print("Enter fourth number: ");
		num4 = input.nextInt();
		
		System.out.print("Enter fifth number: ");
		num5 = input.nextInt();
		
		System.out.println();
		
		if (num1 > num2)
			System.out.printf("%d is larger, %d is smaller%n",
					num1, num2 );
		
		if (num1 > num3)
			System.out.printf("%d is larger, %d is smalle%nr",
					num1, num3 );
		
		if (num1 > num4)
			System.out.printf("%d is larger, %d is smaller%n",
					num1, num4 );
		
		if (num1 > num5)
			System.out.printf("%d is larger, %d is smaller%n",
					num1, num5 );
		
		if (num2 > num1)
			System.out.printf("%d is larger, %d is smaller%n",
					num2, num1 );
		
		if (num2 > num3)
			System.out.printf("%d is larger, %d is smaller%n",
					num2, num3 );
		
		if (num2 > num4)
			System.out.printf("%d is larger, %d is smaller%n",
					num2, num4 );
		
		if (num2 > num5)
			System.out.printf("%d is larger, %d is smaller%n",
					num2, num5 );
		
		if (num3 > num1)
			System.out.printf("%d is larger, %d is smaller%n",
					num3, num1 );
		
		if (num3 > num2)
			System.out.printf("%d is larger, %d is smaller%n",
					num3, num2 );
		
		if (num3 > num4)
			System.out.printf("%d is larger, %d is smaller%n",
					num3, num4 );
		
		if (num3 > num5)
			System.out.printf("%d is larger, %d is smaller%n",
					num3, num5 );
		
		if (num4 > num1)
			System.out.printf("%d is larger, %d is smaller%n",
					num4, num1 );

		if (num4 > num2)
			System.out.printf("%d is larger, %d is smaller%n",
					num4, num2 );
		
		if (num4 > num3)
			System.out.printf("%d is larger, %d is smaller%n",
					num4, num3 );
		
		if (num4 > num5)
			System.out.printf("%d is larger, %d is smaller%n",
					num4, num5 );
		
		if (num5 > num1)
			System.out.printf("%d is larger, %d is smaller%n",
					num5, num1 );
		
		if (num5 > num2)
			System.out.printf("%d is larger, %d is smaller%n",
					num5, num2 );
		
		if (num5 > num3)
			System.out.printf("%d is larger, %d is smaller%n",
					num5, num3 );
		
		if (num5 > num4)
			System.out.printf("%d is larger, %d is smaller%n",
					num5, num4 );
		
		if (num1 == num2)
			System.out.println("First and second numbers are equal");
		
		if (num1 == num3)
			System.out.println("First and third numbers are equal");
		
		if (num1 == num4)
			System.out.println("First and fourth numbers are equal");
		
		if (num1 == num5)
			System.out.println("First and fifth numbers are equal");
		
		if (num2 == num3)
			System.out.println("Second and third numbers are equal");

		if (num2 == num4)
			System.out.println("Second and fourth numbers are equal");

		if (num2 == num5)
			System.out.println("Second and fifth numbers are equal");

		if (num3 == num4)
			System.out.println("Third and fourth numbers are equal");

		if (num3 == num5)
			System.out.println("Third and fifth numbers are equal");

		if (num4 == num5)
			System.out.println("Fouth and fifth numbers are equal");
		
		input.close();
	}

}
