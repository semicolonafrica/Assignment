/**
 * 
 */
package chapter7;

/**
 * @author gbemi
 *
 */
import java.util.Scanner;

public class TotalSales {
	
	public  void getTotal() {
		
		int [][]sales= {{250,100,76,9,},{100,100,2,7,},{50,15,12,6,},{40,23,7,1,},{50,10,3,67}};
		
		int total=0;
		int sum=0;
		
		System.out.printf("%s%15s%15s%15s%15s%15s%n","product","person1","person2","person3","person4","total");
		for(int person=0;person<sales.length;person++) {
			
			
			System.out.print(person+1);
			
			for(int product=0;product<sales[person].length;product++) {
				total+=sales[person][product];
				
				System.out.printf("%15d",sales[person][product]);
				
				sum+=sales[person][product];
			}
			
			System.out.printf("%17d", total);
			
			
			System.out.println();
			
			
			total = 0;
//			sum=0;
		}
		System.out.println();
		int add = 0;
			for(int count = 0; count < 4; count++) {
				
			
		for(int row=0;row<sales.length;row++) {
			
			add = sales[row][count] + add;
		}
		if(count == 0) {
			System.out.printf("%1s%10d","TOTAL ", add);
			add = 0;
		}
		else
			System.out.printf("%15d", add);
		add = 0;

	}
		
	
	}
}
