package chapter4.exercise4_31;

public class BinaryNumber {

	public static void convertTodecimal() {
		int total = 0;
		double number = 1110;
		int counter = 10;
		while(counter >=  1) {
			number %= counter *2 ;
			System.out.printf("%f%n", number);
			
		}
		
	}
}
