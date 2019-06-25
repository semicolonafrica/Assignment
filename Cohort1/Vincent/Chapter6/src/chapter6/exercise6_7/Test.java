package chapter6.exercise6_7;

public class Test {

	public static void main(String[] args) {
		
		double a = Math.abs(7.5);
		double b = Math.floor(7.5);
		double c = Math.abs(0.0);
		double d = Math.ceil(0.0);
		double e = Math.abs(-6.4);
		double f = Math.ceil(-6.4);
		
		 System.out.printf("%f%n%f%n%f%n%f%n%f%n%f%n",a, b, c, d, e, f);
		 
		 double g = Math.ceil(- Math.abs(-8 + Math.floor(-5.5)));
		 System.out.printf("%f", g);
		 
		
	}

}
