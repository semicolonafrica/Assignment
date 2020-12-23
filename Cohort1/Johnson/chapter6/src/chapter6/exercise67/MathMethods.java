package chapter6.exercise67;

public class MathMethods {
	

	public static void absolute(double y) {
		double x = Math.abs(y);
		System.out.println("The value of absolute " + y + " == "+ x);	
	}
	public static void floor(double y) {
		double x = Math.floor(y);
		System.out.println("The value of floor " + y + " == "+ x);	
	}
	public static void ceiling(double y) {
		double x = Math.ceil(y);
		System.out.println("The value of ceiling " + y + " == "+ x);	
	}
	public static void methodStack(double y, double z) {
		double x = Math.ceil(-Math.abs(y + Math.floor(z)));
		System.out.println("The value of absolute " + y + " plus " + " floor " + z +  " == "+ x);	
	}
	public static void main(String[] args) {
		absolute(7.5);
		floor(7.5);
		absolute(0.0);
		ceiling(0.0);
		absolute(-6.4);
		ceiling(-6.4);
		methodStack(-8,-5.5);
		
		double t = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
		System.out.println(t);		
		//x = Math.floor(7.5);
		
		
		

	}

}
