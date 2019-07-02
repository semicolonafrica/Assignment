package chapter6.chapter6_Group;
import java.util.Scanner;
public class Exponentiation {

//	public int integerPower() {
	public static int integerPower() {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter base");
		int base = input.nextInt();
		
		System.out.println("Enter exponent");
		int exponent = input.nextInt();
		
		input.close();
		
		int power  = 1;
		for(int i = 1; i <= exponent; i++) {
			if(exponent == 1) {
			 power = base;
			}
			else {
				power = power * base;
			}
		}
		return power;

	}

}
