package chapter7.exercises;

import java.util.Scanner;

public class VariableNoOfArgument {	
		
		public static int product(int... numbers) {
			int total = 1;
			
			for(int num=0; num<numbers.length; num++) {
				
				total *= numbers[num];
				
			}
			return total;			
		}
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int value = 0;
		
		System.out.println("Enter Number of times: ");
		int numb = input.nextInt();
		
		int [] numbe = new int[numb];
		
//		for(int m =0; m <= numb; m++) {
		
		for(int i=0; i<numbe.length; i++) {
			 value = input.nextInt();
			 
			 numbe[i] = value;
		}
//		}
		System.out.println(product(numbe));
		
		input.close();
	}
}