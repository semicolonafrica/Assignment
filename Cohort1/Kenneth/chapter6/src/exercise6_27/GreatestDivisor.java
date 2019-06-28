/**
 * 
 */
package exercise6_27;

/**
 * @author ken_granero
 *
 */
public class GreatestDivisor {
	
	public static int findGCD(int num1, int num2){
		
		
			if(num1 == 0)
				
			   return num2;
			
			else
				
			   return findGCD(num2 % num1,num1);
		
	
	}
	

	
}
