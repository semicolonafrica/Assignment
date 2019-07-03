package chapter6.exercise621;

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
		System.out.println("Enter number between 1 & 99999: ");
		int num = input.nextInt();
		if((num >=1)&&(num <=99999) ) {
			int digit =0;
			while(num!=0) {
				digit =remainder(num,10);
				string = digit + "  " + string;
				num = quotient(num, 10);
			}
		}
		else{
			string = "Number entered is less than 1 or greater than 99999";	
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
