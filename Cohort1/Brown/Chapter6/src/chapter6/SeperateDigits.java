package Chapter6.exercise6_21;

public class SeperateDigits {
	
	
	public static int calculateRemainder(int a, int b) {
		 
		int remainder = a%b;
		return remainder;
	}

	public static int calculateDivision(int a, int b) {
		
	
		int division = a/b;
		return division;
		
	}
	
	public static void displayDigits(int num) {
		
		if(num <10) {
			int value1 = num;
			System.out.println(value1);
		}
		
		
		else if(num > 9 && num <100) {
			int value1 = num/10;
			int value2 = num%10;
			
			System.out.println("Seperated digits of " + num + "is " + value1 + value2);
			 
	}
		else if(num >99 && num <1000){
			int value1 = num/100;
			int remainder = num % 100;
			int value2 = remainder/10;
			int value3 = remainder % 10;
			
			System.out.println("Seperated digits of " + num + "is " + value1 + " " + value2 + " " + value3);
		}
		else if(num >999 && num < 10000) {
			
			int value1 = num/1000;
			int remainder = num%1000;
			int value2 = remainder/100;
			int remainder1 = remainder % 100;
			int value3 = remainder1/10;
			int value4 = remainder % 10;
			
			System.out.println("Seperated digits of " + num + "is " + value1 + " " + value2 + " " + value3 + " " + value4);
		}
		
		else if(num > 9999 && num < 100000) {
			
			int value1 = num/10000;
			int remainder = num % 10000;
			int value2 = remainder/1000;
			int remainder1 = remainder % 1000;
			int value3 = remainder1/100;
			int remainder3 = remainder1 % 100;
			int value4 = remainder3/10;
			int value5 = remainder3 % 10;
			
			System.out.println("Seperated digits of " + num + "is " + value1 + " " + value2 + " " + value3 + " " + value4 + " " + value5);
		}
		
	}		
	
				
}
