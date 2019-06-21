package chapter4.exercise4_36;

import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a =0;
		int b = 0;
		int c =0;
		int total = 0;
		
		while(total == 0) {
		System.out.print("enter a");
		a = input.nextInt();
		System.out.println(a = a *a);
		
		
		System.out.print("enter b");
		b = input.nextInt();
		System.out.println(b = b * b);
		
		
		c = c + c;
		System.out.print("enter c");
		c = input.nextInt();
		System.out.println(c = c * c);
		
		total = a + b;
		System.out.println(total);
		
		}
		
		if(total == c) {
			
			System.out.println("represent side of a triangle");
			
		}
		
		else {
			System.out.println("not represent side of triangle");
		}
	}

}
