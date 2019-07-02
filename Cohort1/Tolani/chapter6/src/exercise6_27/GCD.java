package exercise6_27;

public class GCD {
	
	public static String findGCD(int num1,int num2) {	
		int remainder = 1;
		
		String print= "";
		
		if(num2 !=0) {
			
			
		while(remainder>0) {
			
			remainder = num1 % num2;
			
			num1 = num2;
			
			num2 = remainder;
			
		}
		 }
		
		if(remainder == 0) {
			
			print = print + num1;
			
		}
		
		if(num2 == 0) {
			print = print + num1;
		}
		
	return print;
	}

}
