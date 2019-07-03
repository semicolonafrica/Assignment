/**
 * 
 */
package chapter4.exercise4_32;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Binary {
	
	private int number;
	
		public int convertBinary(){
			int decimal =0;
			int remainder;
			int counter = 1;
					
			while (number > 0) {
			remainder = number %10;
			
			decimal = remainder * counter + decimal;
			counter += counter;
		
			number = number/10;		
		}
		return decimal;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}
		
		
}