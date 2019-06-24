package chapter6.exercise621;

import java.util.Scanner;
public class SeparatingDigits {

		public int divideTwoNumber(int x, int y) {
			return x/y;
							
		}
		public int modulusTwoNumber(int u, int w) {
			return u%w;
			
		}
		
		public void displayDigit() {
			int unit;
			int tenths;
			int hundredths;
			int thousandths;
			int tenthThousandths;
			int hundredthThousandths;
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int a = input.nextInt();
		if(a >= 1 && a <= 99999) {
			a = a;
					
		}
		else {
			System.out.println("Enter a valid number");
			a = input.nextInt();
			
		}
		
		if(a <= 99)	{
			unit = a/10;
			tenths = a%10;
			String output = Integer.toString(unit) + " "+ Integer.toString(tenths); 
			System.out.println(output);
				
			
		}
		else if (a <= 999) {
			unit = a/100;
			tenths = a%10;
			hundredths = a%10;
			String output = Integer.toString(unit) + " "+ Integer.toString(tenths) + " "+ Integer.toString(hundredths); 
			System.out.println(output);
		
		}
		else if (a <= 9999) {
			unit = a/1000;
			tenths = a%10;
			hundredths = a%10;	
			thousandths = a%100;
			String output = Integer.toString(unit) + " "+ Integer.toString(tenths) + " "+ Integer.toString(hundredths) + " "
					+ Integer.toString(thousandths); 
			System.out.println(output);
			
		
		}
		else if (a <= 99999) {
			unit = a/10000;
			tenths = a%10;
			hundredths = a%10;	
			thousandths = a%100;
			tenthThousandths = a%1000;
			
			String output = Integer.toString(unit) + " "+ Integer.toString(tenths) + " "+ Integer.toString(hundredths) + " "
					+ Integer.toString(thousandths) + " " + Integer.toString(tenthThousandths); 
			System.out.println(output);
			
		
		}
		else if (a <= 999999) {
			unit = a/100000;
			tenths = a%10;
			hundredths = a%10;	
			thousandths = a%100;
			tenthThousandths = a%1000;
			hundredthThousandths = a%10000;
			
			String output = Integer.toString(unit) + " "+ Integer.toString(tenths) + " "+ Integer.toString(hundredths) + " "
					+ Integer.toString(thousandths) + " " + Integer.toString(tenthThousandths) + " " + Integer.toString(hundredthThousandths); 
			System.out.println(output);
			
		
		}
			
		}
}
