/**
 * 
 */
package exercises;

/**
 * @author user
 *
 */
public class PrintMathExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 1;
		int j = 2;
		int k = 3;
		int m = 2;
		
		System.out.println(i == 1);
		System.out.println('i' * '1'); // why is the answer 5145
		System.out.println(j == 3);
		System.out.println(i >= 1); //&& (j = 4)); // why does && not work?
		System.out.println((m <= 99) & (k < m));
		System.out.println((j >= i) || (k == m));
		System.out.println((k + m < j) | (3 - j >= k));
		System.out.println(!(k < m));
		
		
	}

}
