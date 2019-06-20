/**
 * 
 */
package chapter5.exercise5_12;

/**
 * @author Emmanuel Akinbode
 *
 */
public class OddIntergers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int oddNum = 1;
		int counter = 1;
		int product = 1;
		 while(counter<=15) {
			 oddNum =+ counter;
			 
			 product = product * counter;
			 counter+=2;
			 System.out.println(oddNum);
		 }
		 System.out.print(product);
	}

}
