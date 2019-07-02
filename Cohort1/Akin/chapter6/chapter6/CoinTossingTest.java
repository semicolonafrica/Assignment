package chapter6;

import java.util.Scanner;

public class CoinTossingTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of times \nthe coin rolls before landing: ");
		int side = input.nextInt();
		
		CoinTossing.generate(side);
		input.close();
	}
	
}
