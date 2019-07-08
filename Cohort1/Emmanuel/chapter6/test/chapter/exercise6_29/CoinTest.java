/**
 * 
 */
package chapter.exercise6_29;

import java.util.Scanner;

import chapter6.exercise6_29.Coin;

/**
 * @author Emmanuel Akinbode
 *
 */
public class CoinTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enetr num: ");
		int num = input.nextInt();
		
		Coin.tossCoin(num);

	}

}
