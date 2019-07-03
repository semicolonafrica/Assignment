package exercise6_29;

import java.util.Scanner;
public class TossCoinTest {
	public static void main(String[] args) {
		Scanner accept = new Scanner(System.in);
		System.out.println("Please enter number of flip(s): ");
		int numberOfFlip = accept.nextInt();
		
		TossCoin.tossingCoin(numberOfFlip);
		accept.close();
	}

}
