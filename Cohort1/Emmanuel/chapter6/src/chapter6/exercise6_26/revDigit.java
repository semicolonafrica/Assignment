/**
 * 
 */
package chapter6.exercise6_26;

/**
 * @author USER
 *
 */
public class revDigit {
	
	public static int reverseDigit(int num) {
		
		int counter = 0;
		int remainder = 0;
		int d = 0;
		while(num  > 0) {
			
			 remainder = num % 10;
			 d = d * 10 + remainder;
			 num = num/10;
			 
			  
//			  
			 
		}
		//System.out.println(d);
		return d;
	}

}
