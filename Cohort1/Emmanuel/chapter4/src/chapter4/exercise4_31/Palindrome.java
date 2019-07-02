
package chapter4.exercise4_31;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Palindrome {
	
	private int number;
	
	public boolean checkPalindrome() {
		int reversed =0; 
		int remainder;
		int initialNumber = number;
		
		while (number > 0) {
			remainder = number %10;
			reversed = reversed * 10 + remainder;
			number = number/10;
			
		}
		if (reversed == initialNumber) {
			return true;
		}
		else {
			return false;
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	

}
