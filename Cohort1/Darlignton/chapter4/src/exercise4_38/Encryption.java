package exercise4_38;

import java.util.Scanner;
public class Encryption {
	
	public static void main (String[] a) {
		
		Scanner input = new Scanner(System.in);
		
		
		String store = "";
		
		System.out.println("enter the numbers to be encrypt");
		int digit = input.nextInt();
		digit = digit % 10 /10 + 7;
		
		
		
		int num1 = digit % 10;
		digit /= 10;
		
		int num2 = digit % 10;
		digit /= 10;
		int num3 = digit % 10;
		digit /= 10;
		int num4 = digit % 10;
		digit /= 10;
		
		int total = Integer.parseInt(store);
		
		store = num1 + " " + num2 +" "+ num3+" "+ num4;
		
		
		System.out.println(total);
		
	}

		
}
