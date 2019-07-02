package exercise67;

public class MathMethods {
	public static void absolute(double x) {
		double y = Math.abs(x);
		System.out.println("the absolute value of "+ x +" is " + y);
	}
	public static void floor(double x) {
		double y = Math.floor(x);
		System.out.println("the floor value of "+ x +" is " + y);
	}
	public static void ceil(double x) {
		double y = Math.ceil(x);
		System.out.println("the ceil value of "+ x +" is " + y);
	}
	public static void methodStack(double a, double b) {
		double y =  Math.ceil(-Math.abs(a + Math.floor(b)));
		System.out.println("the ceil value of the negative of the absolute of "+ b +" added to floor of "+ a +" is: " + y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		absolute(7.5);
		floor(7.5);
		absolute(0.0);
		ceil(0.0);
		ceil(-6.4);
		absolute(-6.4);
		methodStack(-8,-5.5);
	}

}
