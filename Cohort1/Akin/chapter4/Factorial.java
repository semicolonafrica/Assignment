package chapters;

import java.util.Scanner;
public class Factorial {

	public double getFactorial() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		
		int count = number - 1;
		while(count > 1) {
			if(number == 0) {
				number = 1;
			}else {
			number *= count;
			}
			count--;
		}
		
		System.out.print(number);
		input.close();
		return number;
	}
	public static void main(String[] args) {
		
		Factorial factorial = new Factorial();

		factorial.getFactorial();

	}

}
