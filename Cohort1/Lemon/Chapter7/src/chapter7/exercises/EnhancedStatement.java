package chapter7.exercises;

public class EnhancedStatement {

	public static void main(String... args) {

		double number = 0;

		for (String x : args) {

			number += Double.parseDouble(x);
			
			System.out.println(number);
		}
		System.out.print("Total of CommandLine argument: "+ number);
	}
}