/**
 * 
 */
package chapter6.exercises;

import java.util.Scanner;
/**
 * @author LEMON
 *
 */
public class EvenNumber {
	
	public static void isEven() {
		
		int numb;
		int i=1;
		boolean result = false;
		Scanner ops = new Scanner(System.in);
		
		for(; i>0; i++) {
			
		System.out.println("Enter Integer");
		numb = ops.nextInt();
				
			if(numb == -1) {
				System.out.println("thanks for coming Today!!! catch ya");
				break;
			}
			else if (numb % 2 == 0) {
				System.out.println("true");
			}
			else {
				System.out.println ("false");
			}
			
		}
	}

	public static void main(String[] args) {
		isEven();
	}
}
