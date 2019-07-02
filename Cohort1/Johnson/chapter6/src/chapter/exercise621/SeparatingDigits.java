package chapter.exercise621;

import java.util.Scanner;
public class SeparatingDigits {
	static Scanner input = new Scanner(System.in);
	
	public static int quotient(int a, int b) {
		int integ = a/b;
		return integ;
	}
	public static int remainder(int a, int b) {
		int integ = a%b;
		return integ;
	}
	public static String displayDigits() {
		String string ="";
		System.out.println("Enter number: ");
		int num = input.nextInt();
		int digit =0;
		while(num!=0) {
			digit =remainder(num,10);
			string = digit + "  " + string;
			num = quotient(num, 10);
		}
		return string;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(quotient(10,3));
		System.out.println(remainder(10,4));
		System.out.println(displayDigits());

	}
}