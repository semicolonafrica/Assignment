package Chapter6.exercise6_26;

public class ReversedInteger {
	
public static void reverseInteger(int num) {
		
		if(num <10) {
			int value1 = num;
			System.out.println(value1);
		}
		
		
		else if(num > 9 && num <100) {
			int value1 = num/10;
			int value2 = num%10;
			
			System.out.println("Reversed digits of " + num + " is " + value2 + value1);
			 
	}
		else if(num >99 && num <1000){
			int value1 = num/100;
			int remainder = num % 100;
			int value2 = remainder/10;
			int value3 = remainder % 10;
			
			System.out.println("Reversed digits of " + num + " is " + value3 + " " + value2 + " " + value1);
		}
		else if(num >999 && num < 10000) {
			
			int value1 = num/1000;
			int remainder = num%1000;
			int value2 = remainder/100;
			int remainder1 = remainder % 100;
			int value3 = remainder1/10;
			int value4 = remainder % 10;
			
			System.out.println("Reversed digits of " + num + " is " + value4 + " " + value3 + " " + value2 + " " + value1);
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
			
			System.out.println("Reversed digits of " + num + " is " + value5 + " " + value4 + " " + value3 + " " + value2 + " " + value1);
		}
		
else if(num > 99999 && num < 1000000) {
			
			int value1 = num/100000;
			int remainder = num % 100000;
			int value2 = remainder/10000;
			int remainder1 = remainder % 10000;
			int value3 = remainder1/1000;
			int remainder3 = remainder1 % 1000;
			int value4 = remainder3/100;
			int remainder4 = remainder3 % 100;
			int value5 = remainder4/10;
			int value6 = remainder4%10;
			
			System.out.println("Reversed digits of " + num + " is " + value6 + " " + value5 + " " + value4 + " " + value3 + " " + value2 + " " + value1 );
		}
	}		
	
				

}
