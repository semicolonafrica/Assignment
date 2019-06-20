package chapter6.exercise6_7;

public class ValueOfX {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double z;
		double a;
		double b;
		double c;
		double d;
		
		x = Math.abs(7.5);
		System.out.println(x);
		
		y = Math.floor(7.5);
		System.out.println(y);
		
		z = Math.abs(0);
		System.out.println(z);
		
		a = Math.ceil(0);
		System.out.println(a);
		
		b = Math.abs(-6.4);
		System.out.println(b);
		
		c = Math.ceil(-6.4);
		System.out.println(c);
		
		d = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
		System.out.println(d);
	}


}
