package chapter7.exercise714;
import java.util.Scanner;
public class CalculateProduct {
	
	public static void intergerProduct() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter set of Numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int number4 = input.nextInt();
		
		
		
		System.out.println("The product of " + number1 +" and " +number2 + " is: "  +intergerProduct(number1, number2));
		System.out.println("The product of " + number1 +"," +number2 +"," +number3 +" and " +number4 + " is: " +intergerProduct(number1, number2, number3, number4));
		
	}
	
	
	public static int intergerProduct(int...numbers) {
		
		int store = 1;
		for(int total : numbers) {
			store *= total;
		}
		return store;
	}

}
