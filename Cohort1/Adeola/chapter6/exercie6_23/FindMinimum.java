package exercie6_23;
import java.util.Scanner;

public class FindMinimum {
	static Scanner input = new Scanner(System.in);
	public static double minimum3() {
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		double min = Math.min(number1, Math.min(number2, number3));
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimum3());
	}

}
