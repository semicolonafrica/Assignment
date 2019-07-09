package chapter7;

public class EnhancedForStatement {
	
	public static void main(String[] args) {
		
		if(args.length < 0) {
			System.out.print("Enter valid floating point number: ");			
		} else {
			
			//double arrayLength = (double)Double.parseDouble(args[0]);
			double value1 = Double.parseDouble(args[0]);
			double value2 = Double.parseDouble(args[1]);
			double value3 = Double.parseDouble(args[2]);
			double value4 = Double.parseDouble(args[3]);
			
			double[] array = { value1,value2,value3,value4 };
			double total = 0.0;
			for(double d : array) {
				
				total += d;
				
			}
			System.out.printf("%s %.2f, %.2f, %.2f \nand %.2f is: %.2f","The sum of ",array[0],array[1],array[2],array[3],total);
		}
		
	}
	
}
