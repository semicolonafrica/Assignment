package exercise6_14;

import java.util.Scanner;
public class MathsTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter base value: ");
		int base = input.nextInt();
		
		System.out.print("Enter base value: ");
		int exponent =input.nextInt();
		
		System.out.println(Maths.integerPower(exponent,base));
		
		input.close();
	}

}
