/**
 * 
 */
package chapter6;

/**
 * @author gbemi
 *
 */
import java.util.Scanner;
public class GreatestCommonDivisorTest {
	
	public static void main (String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter  two value ");
		int value1 = input.nextInt();
		int value2 = input.nextInt();
		
		GreatestCommonDivisor.gcd(value1,value2);
		
	}

}
