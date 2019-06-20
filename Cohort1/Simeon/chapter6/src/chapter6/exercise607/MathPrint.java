package chapter6.exercise607;

public class MathPrint {

	public void calMathPrint() {
		double x;
		System.out.println(x = Math.abs(7.5));
		System.out.println(x = Math.floor(7.5));
		System.out.println(x = Math.abs(0.0));
		System.out.println(x = Math.ceil(0.0));
		System.out.println(x = Math.abs(-6.4));
		System.out.println(x = Math.ceil(-6.4));
		System.out.println(x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5))));
	}

}
