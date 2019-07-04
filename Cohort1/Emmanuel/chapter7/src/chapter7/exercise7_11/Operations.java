/**
 * 
 */
package chapter7.exercise7_11;

import java.security.SecureRandom;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Operations {
	static SecureRandom randomNumbers = new SecureRandom();
	
	public static void countIntegers() {
		int [] array = new int[10];
		
		System.out.printf("%s%10s%n","Numbers","Values");
		for(int counter = 0; counter < array.length; counter++ ) {
			
			System.out.printf("%3d%12d%n", counter, array [counter]);
		}
		
	}
	
	public static int addOne() {
		
		int [] bonus = new int [15];
		int num = 0;
		
		System.out.printf("%s%15s%n","Initial Num", "Bonus Num");
		for(int i = 0; i < bonus.length; i++) {
			bonus[i] = 12 + randomNumbers.nextInt(50);
			num = bonus[i] + 1;
			
			System.out.printf("%5d%20d%n",bonus[i], num);
		}
		
		return num;
		
	}
	
	public static int displayScore() {
		 
		int [] score = new int [5];
		int num = 0;
		
		System.out.printf("%s%10s%n","Best Scores", "Values");
		for(int i = 0; i < score.length; i++) {
			score [i] = 10 + randomNumbers.nextInt(25);
			num = score  [i];
			
			System.out.printf("%5d%14d%n",i, num);
		}
		
		return num;
		
	}


	public static void main(String[] args) {
		
		Operations.countIntegers();
		Operations.addOne();
		Operations.displayScore();
		
		

	}

}
