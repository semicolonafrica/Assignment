/**
 * 
 */
package chapter6;

/**
 * @author User
 *
 */
import java.util.Scanner;
public class Minimum {
	
    public static int getMinimum(int num1,int num2,int num3) {
    	
    	
    int minimum=Math.min (num1, Math.min(num2,num3));
    return minimum;
    
    
    
   }
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		System.out.println("enter the the number you want to compare");
		int num1=input.nextInt();
		int num2 = input.nextInt();
		int num3=input.nextInt();
		System.out.println(" the minimum is " + getMinimum(num1,num2,num3));
    	
    	input.close();
    }
    
}