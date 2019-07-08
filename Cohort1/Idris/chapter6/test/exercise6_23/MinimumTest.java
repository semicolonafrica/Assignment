package exercise6_23;

import java.util.Scanner;
public class MinimumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner accept = new Scanner(System.in);
		System.out.println("Enter first value to be checked");
		double valueA = accept.nextDouble();
		
		System.out.println("Enter second value to be checked");
		double valueB = accept.nextDouble();
		
		System.out.println("Enter third value to be checked");
		double valueC = accept.nextDouble();
		
		System.out.println(Minimum.findMinimum(valueA,  valueB,  valueC));
		accept.close();
	}

}
