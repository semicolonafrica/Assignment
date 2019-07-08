package chapter6.chapter6_Group;
import java.util.Scanner;
public class MinimumImplementation {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first number");
		double first = obj.nextDouble();
		
		System.out.print("Enter second number");
		double second = obj.nextDouble();
		
		System.out.print("Enter third number");
		double third = obj.nextDouble();
		
		System.out.printf("%s%6.2f%n", "The minimum is: ", Minimum.minimum3(first, second, third));
	}
	

}
