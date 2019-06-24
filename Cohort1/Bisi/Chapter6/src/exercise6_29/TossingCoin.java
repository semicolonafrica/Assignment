package exercise6_29;

import java.security.SecureRandom;

public class TossingCoin {

	private static void tossCoin() {
		
	}
	private static SecureRandom Toss = new SecureRandom();
	
	private enum Coin {HEAD,TAIL};
	
	public static int flip() {
	int coin = 1 + Toss.nextInt(1);
	return coin;
	

}
public static void main(String[] args) {
		int store = 0;
	}
}