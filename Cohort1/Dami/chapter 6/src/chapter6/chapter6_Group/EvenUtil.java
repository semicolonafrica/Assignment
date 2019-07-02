package chapter6.chapter6_Group;

public class EvenUtil {
	
	public static int isEven(int x) {
		if(x%2 == 0) {
			System.out.print("True, " + x + " is an even number");
		}
		else {
			System.out.print("False, " + x + " is NOT an even number");
		}
		return x;
	}

}
