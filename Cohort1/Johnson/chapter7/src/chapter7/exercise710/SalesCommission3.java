/* Author: ADEBAYO Johnson
 Date: 04/07/2019 
 Location of exercise:  Example 7.3
 Purpose: For calculating sales commission (Version2)
*/

package chapter7.exercise710;

import java.util.Scanner;
import java.security.SecureRandom;
public class SalesCommission3 {
	static SecureRandom random = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	

	public static void main(String[] args) {
		sales();
	}
	public static void sales() {
		System.out.print("Enter the number of sales to analyse: ");
		int number = input.nextInt();
		int[] earn = new int[number];
		int [] grossSales = new int[number];
		int[] frequency = new int[100];
		for(int i = 0; i < grossSales.length; i++) {
			grossSales[i] = random.nextInt(10000);
			earn[i] = 200 + (int)(grossSales[i]*0.09);
			System.out.println("Total earn on " + grossSales[i] + " is " + earn[i]);
			int a = earn[i]/100;
			if(a==2 ) {
				frequency[2] += 1;
			}
			if(a==3 ) {
				frequency[3] += 1;
			}
			if(a==4 ) {
				frequency[4] += 1;
			}
			if(a==5 ) {
				frequency[5] += 1;
			}
			if(a==6 ) {
				frequency[6] += 1;
			}
			if(a ==7 ) {
				frequency[7]++;
			}
			if(a==8 ) {
				frequency[8] += 1;
			}
			if(a==9 ) {
				frequency[9] += 1;
			}
			if(a>=10) {
				frequency[10] += 1;
			}
		}
		System.out.println("Range" + "\tFrequency");
		System.out.println("200-299: \t" + frequency[2]+ "\n300-399: \t" + frequency[3]);
		//System.out.println("300-399: \t" + frequency[3]);
		System.out.println("400-499: \t" + frequency[4] + "\n500-599: \t" + frequency[5]);
		//System.out.println("500-599: \t" + frequency[5]);
		System.out.println("600-699: \t" + frequency[6]+ "\n700-799: \t" + frequency[7]);
		//System.out.println("700-799: \t" + frequency[7] );
		System.out.println("800-899: \t" + frequency[8] + "\n900-999: \t" + frequency[9]);
		//System.out.println("900-999: \t" + frequency[9]);
		System.out.println("1000 & over: \t" + frequency[10] );	
	}
}
