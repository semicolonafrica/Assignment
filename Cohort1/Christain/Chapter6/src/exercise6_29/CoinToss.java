package exercise6_29;
import java.security.SecureRandom;
import java.util.Scanner;
public class CoinToss {
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	private enum Coin{ HEAD, TAIL};
	
	public static int head = 0;
	public static int tail = 0;
	public void flip() {
		int toss = 0;
		int menu = 1;
		
		while(menu == 1) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter 1 to toss coin or 0 to quit: ");
			menu = input.nextInt();
			 toss = randomNumbers.nextInt(2);
		
		if(toss == 0) {
			System.out.println(Coin.HEAD);
			head++;
		}else {
			System.out.println(Coin.TAIL);
			tail++;
		}
	}
		System.out.println("Number of HEAD: " + head);
		System.out.println("Number of TAIL: " + tail);
	}
}
