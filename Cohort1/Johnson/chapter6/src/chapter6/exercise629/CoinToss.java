/* Author: ADEBAYO Johnson
 Date: 24/06/2019 
 Location of exercise:  Exercise 6, Question 6.27
 Purpose: Coin Toss
*/

package chapter6.exercise629;

import java.security.SecureRandom;
import java.util.Scanner;
public class CoinToss {
	static SecureRandom random = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	static int coin =0;
	static int head =0;
	static int tail = 0;
	
	static enum Coin{HEAD,TAIL};
	static Coin a = Coin.HEAD;
	static Coin b = Coin.TAIL;
	public static Coin flip() {
		if(coin == 1) {
			return a;	
		}
		if(coin == 2);{
			return b;
		}
	}
	public static void tossCoin() {
		coin = 1 + random.nextInt(2);
		System.out.println(flip() + "\n");
		if(coin == 1) {
			head +=1;
		}
		if(coin == 2) {
			tail +=1;
		}
	}
	public static void main(String[] args) {
		
		for (int counter = 1; counter<=10; counter++) {
			System.out.println("Menu" );
			System.out.println("Toss coin (Enter 1)");
			System.out.println("Stop coin (Enter 2)");
			int menu2 = input.nextInt();
			if(menu2 == 1 ) {
				tossCoin();
				continue;
			}
			if (menu2 ==2) {
				break;
			}
		}
		System.out.println("\nTotal head: " + head);
		System.out.println("\nTotal tail: " + tail);
	}
}
