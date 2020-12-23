package exercise6_24;

import java.util.Scanner;
public class PerfectNumbersTest {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
	System.out.println("enter integer");
	int value = input.nextInt();
	System.out.println(PerfectNumbers.isPerfect(value));
	

	}

}
