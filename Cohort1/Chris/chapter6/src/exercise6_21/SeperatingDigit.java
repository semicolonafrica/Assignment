package exercise6_21;

import java.util.Scanner;

public class SeperatingDigit {
	//method to perform division
	public static int division(int num1, int num2) {
		int quotient = num1 / num2;
		return quotient;
	}
	//method to perform modulo
	public static int modulo(int firstNum, int secondNum) {
		int remainder = firstNum % secondNum;
		return remainder;
	}
	
	public static String displayDigit(int number) {
		String space = " ";
		int remainder;
		
			//loop that calls the static methods modulo and division
			while(number > 0) {
				remainder = modulo(number,10);
				space =  remainder+ " " + space;
				number = division(number, 10);
				
			}
		return space;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter digits betweeen 1 to 100,000");
		int digits = input.nextInt();
		
		if(digits > 0 && digits < 100000) {
			System.out.printf("The spaced version of your number is: %n%s",displayDigit(digits));
		}else {
			System.out.println("The number you have entered is out of range!!");
		}
	}

}
