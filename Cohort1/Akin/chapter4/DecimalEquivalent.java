package chapters;
import java.util.Scanner;

public class DecimalEquivalent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = 1101;
		
		int val1 = num1 % 10;
		
		val1 = (val1 * 1);

		num1 = num1 / 10;
		
		int val2 = num1 % 10;
		val2 = (val2 * (2));
		
		num1 = num1 / 10;
		
		int val3 = num1 % 10;
		val3 = (val3 * (int)(Math.pow(2, 2)));
		
		num1 = num1 / 10;
		
		int val4 = num1 % 10;
		
		val4 = val4 * (int)(Math.pow(2,3));
		
		System.out.print(val1+val2+val3+val4);
		
		input.close();
	}

}
