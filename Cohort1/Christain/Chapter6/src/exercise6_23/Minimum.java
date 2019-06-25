package exercise6_23;
import java.util.Scanner;
public class Minimum {
	
	public void minimum3() {
		
		Scanner input  = new Scanner(System.in);
		System.out.print("Enter decimal number: ");
		double num1 = input.nextDouble();
		
		System.out.print("Enter decimal number: ");
		double num2 = input.nextDouble();
		
		System.out.print("Enter decimal number: ");
		double num3 = input.nextDouble();
		
		double num4 = Math.min(Math.min(num1, num2), num3);
		
		System.out.println("The smallest number is: " + num4);
	}
}
