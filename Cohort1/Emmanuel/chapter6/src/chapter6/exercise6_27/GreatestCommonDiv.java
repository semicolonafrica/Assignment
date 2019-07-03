/**
 * 
 */
package chapter6.exercise6_27;

/**
 * @author Emmanuel Akinbode
 *
 */
public class GreatestCommonDiv {
	
	public static int checkGreatestDiv(int num1, int num2) {
		
		int remainder = 0;
		
		if(num1 > num2) {
			remainder = num1 % num2;
		}else if(num2 > num1) {
			remainder = num2 % num1;
		}
		while(remainder != 0) {
			num1= num2;
			num2 = remainder;
			
			remainder = num1 % num2;
			
		
		}
		return num2;
	}

	

}
