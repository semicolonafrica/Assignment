package chapter6.chapter6_Group;

public class Multiples {

	public static boolean isMultiple(int num1, int num2) {
		if(num1 % num2 == 0) {
			System.out.printf("%s%d%s%d%n", "True ", num2, " is a multiple of ", num1);
		}
		else {
			System.out.printf("%s%d%s%d%n", "False ", num2, " is NOT a multiple of ", num1);
		}
		
	return true;
	}

}
