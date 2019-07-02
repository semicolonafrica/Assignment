package exercise6_17;

import java.util.Scanner;
public class EvenOrOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter range of number to check: ");
		int number1 = input.nextInt();
		int i, number;
		for(i =1; i<=number1;i++) {
			System.out.print("Enter number to be checked: ");
			number = input.nextInt();
			
			System.out.println(EvenOrOdd.isEven(number));
		}
		input.close();
	}

}
