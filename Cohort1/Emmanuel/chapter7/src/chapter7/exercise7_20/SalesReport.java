/**
 * 
 */
package chapter7.exercise7_20;

import java.security.SecureRandom;

/**
 * @author USER
 *
 */
public class SalesReport {
	
	static SecureRandom randomNumbers = new SecureRandom();
	
	public static int generateSales() {
		
		int salesValue = 2 + randomNumbers.nextInt(9); 
		return salesValue;

	}

	
	public static void assignSales() {
		
		int rowTotal = 0;
			int colTotal =0;
			
		int [][] sales = new int[5][4];
		
		System.out.printf("%2s%3s%6s%5s%7s%8s%n", "Prod", "1","2","3","4","Total");
		for(int row = 0; row < sales.length; row++) {
			rowTotal = 0;
			
			System.out.print(row+1);
			for(int col = 0; col < sales[row].length; col++) {
				sales[row][col] = generateSales();
				rowTotal += sales[row][col];
				System.out.printf("%6d%s", sales[row][col] , "");
			}
			System.out.printf("%7d",rowTotal );
			System.out.println();
		}
		System.out.print("Total");
		for(int col = 0; col < sales[col].length; col++) {
			colTotal = 0;
		
			for(int row = 0; row < sales.length; row++) {
				
				colTotal += sales[row][col];
				
		}

			System.out.printf("%4d ", colTotal);
		}
	
	}
	public static void main(String[] args) {
		assignSales();
	}
	}

//Alternate way of looping the column.
//for(int row = 0; row < sales[row].length; row++) {
//	colTotal = 0;
//
//	for(int col= 0; col < sales.length; col++) {
//		
//		colTotal += sales[col][row];