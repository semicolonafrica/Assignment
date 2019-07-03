package chapter6.exercise621;

import java.util.Scanner;
public class SeparatingDigit2 {
	static Scanner input = new Scanner(System.in);
	static int divisor1 = 0;
	static int remainder1 = 0;

	public static int quotient(int a, int b) {
		int integ = a/b;
		return integ;
	}
	public static int remainder(int a, int b) {
		int integ = a%b;
		return integ;
	}
	public static String displayDigit() {
		String string = "";
		int power1 = 0; // power of 10
		System.out.println("Enter number between 1 to 99999: ");
		String number = input.nextLine();
		int number1 = Integer.parseInt(number);
		if((number1 >=1)&&(number1 <=99999) ) {
			for (int i=number.length()-1; i>=0; i--) {
				power1 = (int) Math.pow(10, i);
				divisor1 = quotient(number1, power1); // dividing by power of 10 to obtain quotient
				remainder1 = remainder(number1,power1); // to obtain the remainder
				string = string + divisor1 + "  ";
				number1 = remainder1;	
			}	
		}
		else {
			string = "Number entered is less than 1 or greater than 99999";
		}
		return string;
	}
	public static void main(String[] args) {
		System.out.println(displayDigit());
	}
}
