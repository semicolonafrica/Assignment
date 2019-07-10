package exercise716;

public class DoubleConvert {

	public static void main(String[] args) {
		double [] temp = new double[args.length];
	
		double add = 0.0;
		
		for(int i = 0; i < args.length; i++) {
			add = Double.parseDouble(args[i]);
			temp[i] = add;
			System.out.printf("%2d\t%4f%n", i, temp[i]);
				
		}
		double total = 0;
		for(double value : temp) {
			
			total += value;
		}
		System.out.printf("the total is: %2f",total);
		System.out.println();
	}

}
