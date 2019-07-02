/**
 * 
 */
package exercise6_27;

import java.util.Scanner;

/**
 * @author ken_granero
 *
 */
public class GreatestDivisorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner insert = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num1 = insert.nextInt();
		
		System.out.print("Enter number: ");
		int num2 = insert.nextInt();
		
		
		if(num1 == 0||num2 == 0)
		   System.out.println("The Greatest divisor is 0");
		else
		   System.out.println("The GreatestDivisor is "+GreatestDivisor.findGCD(num1,num2));
		
		insert.close();
		
	}

	

}
