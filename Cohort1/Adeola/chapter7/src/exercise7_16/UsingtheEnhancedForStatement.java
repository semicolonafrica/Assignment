package exercise7_16;

public class UsingtheEnhancedForStatement {

	public static void main(String[] args) {
 
		double[] array = new double [args.length];
		
		double value= 0.0;
		for (int i=0; i < args.length; i++) {
			value = Double.parseDouble(args[i]);
			array[i]=value;
			System.out.printf("%4d%5f%n",i, array[i] );
		}
		int total =0;
		for(double num :array) {
			total += num;		
	}
		System.out.println(total);
	}

}
