package chapter6.exercise616;

import java.util.Scanner;

public class Pairs {
	
	public static void isMultiple() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of pairs: ");
		int n = input.nextInt();
		
		
		for (int i = 1; i <= n; i++)
		{
			System.out.print("Enter first number: ");
			int x = input.nextInt();
			
			System.out.print("Enter second number: ");
			int y = input.nextInt();
			
			if (y % x == 0)
				System.out.println(true);
			else
				System.out.println(false);
		}
	}
}
