package chapter6.exercise626;

import java.util.Scanner;
public class ReversedDigits {
	static Scanner input = new Scanner(System.in);
	public static int quotient(int a, int b) {
		int integ = a/b;
		return integ;
	}
	public static int remainder(int a, int b) {
		int integ = a%b;
		return integ;
	}
	public static String reverseDigits() {
		String string ="";
		System.out.println("enter number: ");
		int num = input.nextInt();
		int digit =0;
		while(num!=0) {
			digit =remainder(num,10);
			string = string + "" + digit;
			num = quotient(num, 10);
		}
		return string;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The reversed of the number entered: " + reverseDigits());
	}
}

