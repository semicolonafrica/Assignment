package chapter6;
import java.util.Scanner;
public class RoundingNumbers2Test {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RoundingNumbers2 obj = new RoundingNumbers2();
		
		System.out.print("How many numbers do you want to process?: ");
		int num = input.nextInt();
		
		for(int i = 1; i<=num; i++) {
			System.out.print("Enter number to process: ");
			double number = input.nextDouble();
			System.out.println("Original value is: " + number );
			System.out.println("value to the nearest Integer is : " + obj.roundInteger(number));
			System.out.println("value to the nearest Tenth is : " +  obj.roundToTenths(number));
			System.out.println("value to the nearest Hundred is : " +  obj.roundToHundredths(number));
			System.out.println("value to the nearest Thousandth is : " +  obj.roundToThousandths(number));
		}
	}

}
