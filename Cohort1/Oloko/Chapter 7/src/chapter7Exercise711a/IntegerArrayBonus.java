/**
 * 
 */
package chapter7Exercise711a;

/**
 * @author Olayinka Oloko
 *
 */
public class IntegerArrayBonus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayBonus;
		arrayBonus = new int [16];

			System.out.println(" Index \t  Value");
		
			for(int i = 2; i < arrayBonus.length; i++) {
				
				arrayBonus[i] = 1;
			
				System.out.printf("%5d%8d%n", i, arrayBonus[i]);
			}
			
				
	}

}
