package exercise6_10;

public class RoundingNumber {
	public static int roundNum() {
		double num1 = 5.4;
		double num2 = 4.2;
		
		int num3 = (int) Math.floor(num1 + 0.5);
		int num4 = (int) Math.floor(num2 + 0.5);
		
		System.out.println("Original number is 5.4..");
		System.out.print("Rounded number is " + num3);
		System.out.println();
		System.out.println("Original number is 4.0..");
		System.out.print("Rounded number is " + num4);
		return num4;
		
	}
}
