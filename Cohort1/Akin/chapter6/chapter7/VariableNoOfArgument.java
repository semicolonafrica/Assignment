package chapter7;

public class VariableNoOfArgument {

	
	
	
	
	
	
	
	public static int product(int... numbers) {
		int total = 1;
		for(int num : numbers) {
			
			total *= num;
			
		}
		return total;
		
	}
}
