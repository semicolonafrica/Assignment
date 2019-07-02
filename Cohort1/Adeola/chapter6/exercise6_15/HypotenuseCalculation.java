package exercise6_15;

public class HypotenuseCalculation {
	public static double hypotenuse(double side1, double side2) {
		double side1Square = Math.pow(side1, 2);
		double side2Square = Math.pow(side2, 2);
		double hypotenuse = Math.sqrt(side1Square+side2Square);
		return hypotenuse;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hypotenuse(3,4));
		System.out.println(hypotenuse(5,12));
		System.out.println(hypotenuse(8,15));
		System.out.println(hypotenuse(3.5,4.8));
		System.out.println(hypotenuse(32.34,23.76));
	}

}
