package chapter6.exercise616;

import java.util.Scanner;

public class Multiple {
	
	public void multiple() {
		Scanner input = new Scanner(System.in);
		//boolean flag = false;
		//System.out.println("Enter first number: ");
		int a = 0;
		
		while(a != -1) {
			
		System.out.println("Enter first number or -1 to quit: ");
		a = input.nextInt();
		if(a== -1) {
			System.out.println("You exit the application ");
			break;
		}
		System.out.println("Enter second number: ");
		int b = input.nextInt();

		boolean z = isMultiple(a,b);
		System.out.println(z);
//		System.out.println("Enter first number: ");
//		 a = input.nextInt();
		}
		
		//return flag;
		
		
		
		
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
	public boolean isMultiple(int a, int b) {
		
		if(b%a == 0) {
			return true;
		}
		else
			return false;
	}
//	}

}
