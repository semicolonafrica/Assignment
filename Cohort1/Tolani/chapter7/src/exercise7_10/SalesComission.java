package exercise7_10;

import java.util.Scanner;

public class SalesComission {
	public static void checkSomething() {
		Scanner insert = new Scanner(System.in);
		System.out.println("Enter number of sales person:");
		final int input = insert.nextInt();
		int grosspay = 0;
		int answer = 0;
		int [] result = new int[input];
		for(int i = 0;i < input;i++) {
			System.out.println("Enter gross pay for each sales person :");
			grosspay = insert.nextInt();
			answer = (int) (200 + 0.09 *(grosspay));
			result[i] = answer;
			System.out.println(i + "" + result[i]);
		}
		int [] frequency = new int[11];
		
		int store = 0;
		int freq = 0;
		
		for(int count = 0; count< result.length;count++)
		{
			++frequency[result[count]/100];
		}
		
		for(int k = 2; k < frequency.length;k++) {
				
			if(k >= 10) {
				System.out.printf("$%6s: ","1000 and over");
			}else {
				System.out.printf("$%03d - $%03d:", k * 100,k * 100 + 99);
			}
			for(int j = 0; j < frequency[k];j++) {
		
				store = store + 1;		
				if(store == frequency[k]) {
					freq = store;
					System.out.print(freq);
				}
				
				
			}
			
		
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner insert = new Scanner(System.in);
//		
//		System.out.println("Enter input :");
//			int input = insert.nextInt();
			checkSomething();
	}

}
