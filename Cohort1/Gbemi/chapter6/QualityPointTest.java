package chapter6;

import java.util.Scanner;
public class QualityPointTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter grade value");
		int value = input.nextInt();
		
		QualityPoint.getQualityPoint(value);
		}

}
