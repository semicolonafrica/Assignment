/**
 * 
 */
package chapter6;

/**
 * @author gbemi
 *
 */
import java.util.Scanner;

public class Distance {
	
	public static double horizontalPoint(int x1,int x2) {
		
		int result = x2-x1;
		
		return result*result;
		
	}
	
	public static double verticalPoint(int y1,int y2) {
		
		int result = y2-y1;
		
		return result*result;
	}
	
	public static double getPoint(int x1,int x2,int y1,int y2) {
	
		double result=horizontalPoint(x1,x2)+verticalPoint(y1,y2);
		
		 
		
		return Math.sqrt(result);
		
	
	}
	public static void main(String[] args) {
		
		Scanner accept=new Scanner(System.in);
		System.out.println("enter value for horizontal point(X asis)");
		int input1 = accept.nextInt();
		int input2 = accept.nextInt();
		
		System.out.println("enter value for vertical point(Y asis)");
		int value1 = accept.nextInt();
		int value2 = accept.nextInt();
		
		
		System.out.println(horizontalPoint(input1,input2));
		System.out.println(verticalPoint(value1,value2));

		
		System.out.println(getPoint(input1,input2,value1,value2));
		
	}

}
