package chapter8;

public class Complex {

	//Create private fields for variables
	private double realPart1;
	private double realPart2;
	private double imaginaryPart1;
	private double imaginaryPart2;
	
	
	public Complex() {
		this(0.0,0.0,0.0,0.0);
	}
	
	public Complex(double realPart1, double realPart2, double imaginaryPart1,double imaginaryPart2) {
		this.realPart1 = realPart1;
		this.realPart2 = realPart2;
		this.imaginaryPart1 = imaginaryPart1;
		this.imaginaryPart2 = imaginaryPart2;
	}

	public double getRealPart1() {
		return realPart1;
	}

	public void setRealPart1(double realPart1) {
		this.realPart1 = realPart1;
	}

	public double getRealPart2() {
		return realPart2;
	}

	public void setRealPart2(double realPart2) {
		this.realPart2 = realPart2;
	}

	public double getImaginaryPart1() {
		return imaginaryPart1;
	}

	public void setImaginaryPart1(double imaginaryPart1) {
		this.imaginaryPart1 = imaginaryPart1;
	}

	public double getImaginaryPart2() {
		return imaginaryPart2;
	}

	public void setImaginaryPart2(double imaginaryPart2) {
		this.imaginaryPart2 = imaginaryPart2;
	}
	
	public double addReal() {
		
		double result = getRealPart1() + getRealPart2();
		return result;
	}
	
	public double addImaginary() {
		
		double result = getImaginaryPart1() + getImaginaryPart2();
		return result;
	}
	
	public String toStringAdd() {
		
		return "(" + addReal() + "," + addImaginary() + ")";
				
	}
	
	public double subtractReal() {
		
		double result = getRealPart1() - getRealPart2();
		return result;
	}
	
	public double subtractImaginary() {
		
		double result = getImaginaryPart1() - getImaginaryPart2();
		return result;
	}
	
	public String toStringSubtract() {
		
		return "(" + subtractReal() + "," + subtractImaginary() + ")";				
	}
}
