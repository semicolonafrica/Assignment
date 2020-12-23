/**
 * 
 */
package chapter6;

/**
 * @author gbemi
 *
 */

import java.util.Scanner;

public class Quotient {
	
	public static int getQuotient(int num1,int num2) {

		int quotient = num1/num2;
		
		return quotient;
		
	}
	public static int getRemainder(int x,int y) {
		
		int remainder=x % y;
		
		return remainder;
	}
	
	public static String displayDigit(int numb) {
		String store="  ";
		
		if(numb>=1&&numb<100000) {
			while(numb!=0) {
				int result=getRemainder(numb,10);
				store = result +"  " + store;
				numb/=10;
				
			}
			
		}
		else {
			System.out.println("invalid input,enter the number within the range");
		}
			return store;
			

	}
	
	public static void main(String[] args) {
		
		Scanner accept = new Scanner(System.in);
		
		System.out.println("enter value");
		
		int input1 = accept.nextInt();
		
		int input2 = accept.nextInt();
		
		System.out.println("the integer part of the quotient is:" + getQuotient(input1,input2));
		System.out.println("the remainder part of the quotient is:" + getRemainder(input1,input2));
		System.out.println("the separation of the number is:" + displayDigit(input1));



		
	}
}

//if (numb >0 && numb<9) {
//int value = numb;
//System.out.printf("%d ", value);
//}
//
//if (numb>9 && numb <100) {
//int value = numb/10;
//int value1 = numb%10;
//
//
//System.out.printf("%d  %d ", value, value1);
//}
//
//if (numb>99 && numb <1000) {
//int value = numb/100;
//int remainder = numb%100;
//int value1 = remainder/10;
// remainder = remainder%10;
//int value2 = remainder/1;
//
//System.out.printf("%d  %d  %d  ", value, value1, value2);
//}
//
//if (numb>999 && numb <10000) {
//int value = numb/1000;
//int remainder = numb%1000;
//int value1 = remainder/100;
// remainder = remainder%100;
//int value2 = remainder/10;
//remainder = remainder%10;
//int value3 = remainder/1;			
//
//System.out.printf("%d  %d  %d  %d  ", value, value1, value2, value3);
//}
//
//if (numb>9999 && numb <100000) {
//int value = numb/10000;
//int remainder = numb%10000;
//int value1 = remainder/1000;
// remainder = remainder%1000;
//int value2 = remainder/100;
//remainder = remainder%100;
//int value3 = remainder/10;
//remainder = remainder%10;
//int value4 = remainder;
//
//System.out.printf("%d  %d  %d  %d  %d", value, value1, value2, value3, value4);
//
//}
