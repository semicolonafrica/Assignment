package chapter6;
	import java.util.Scanner;
public class FindMinimum {
	
	public static int calcMin(int one, int two, int three) {
	Scanner input = new Scanner(System.in);
	
	int minimum = Math.min(one, Math.min(two, three));
	
	return minimum;
	
	}
	
}
