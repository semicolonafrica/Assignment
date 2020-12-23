package exercise6_24;

import exercise6_15.Maths;

public class PerfectNumber {
	
	public static boolean isPerfect(int number) {
		int count = 1;
		int remainder = 0;
		int add = 0;
		String display = " ";
	
		while(count < number) {
			remainder = Maths.remainder(number,count);		
			if(remainder == 0) {			
				add = add + count;																							
				display = display+ " " + count +",";
			}
				
			count++;	
		}
		if(add == number) {
			System.out.println("The factors of "+ add + " are " + display);
			return true;
			
		}
	
		return false;
	}
	
	public static void displayPerfectNumber() {
		
		for(int i = 1; i<=1000 ; i++) {
			 isPerfect(i);
					
		}
	
	}
	
}
