/**
 * 
 */
package chapter5.examples;

/**
 * @author user
 *
 */
public class ForCounter1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++)
		System.out.printf("%d " , i);
		
		for(int i = 100; i >= 100; i--)
			System.out.printf("%d " , i);
		
		for(int i = 7; i <= 77; i +=7)
			System.out.printf("%d " , i);
		
		for(int i = 20; i <= 2; i -=2)
			System.out.printf("%d " , i);
		
		for(int i = 2; i <= 20; i += 3)
			System.out.printf("%d " , i);
		
		for(int i = 99; i >= 0; i -= 11)
		System.out.printf("%d " , i);
		
	}

}
