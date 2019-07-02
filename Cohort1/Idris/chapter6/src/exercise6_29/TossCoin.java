package exercise6_29;

import java.security.SecureRandom;
public class TossCoin {
	 
	 private static enum Coin{head,tail};
	 public static  int tossingCoin(int numberOfFlip) {
		 SecureRandom rand = new SecureRandom();
		int head=0;
		int tail = 0;
		int coin = 1;
		
		 for(int i = 1;i<= numberOfFlip;i++) {
			 coin = rand.nextInt(2);
			 if(coin == 0) {
				 tail++;
			 }
			 else if(coin == 1) {
				 head++;
			 }
		 }
		 System.out.printf("%S Heads:%d%n Tails:%d%n %s",
				 "for the number of flips:",head,tail, flip());
		 return coin;
	 }
	 public static Coin flip() {
		 Coin tom = null;
		 SecureRandom rand = new SecureRandom();
		 int roll=rand.nextInt(2);
		 
		 if(roll==0) {
			 tom = Coin.tail;
		 }
		 if(roll==1) {
			 tom = Coin.head;
		 }
		return tom;	 
	 }
}
	