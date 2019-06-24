package exercise6_7;

// @author Chukwuebuka & Olabisi

public class Execution {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1 = Math.abs(-7.5);
		double x2 = Math.floor(7.5);
		double x3= Math.abs(0.0);
		double x4 = Math.ceil(0.0);
		double x5 = Math.abs(-6.4);
		double x6 = Math.ceil(-6.4);
		double x7 = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		System.out.println(x6);
		System.out.println(x7);
	}
}
