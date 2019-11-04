package exercise8_11;

public class Complex {
	
	private double realPart;
	
	private double imaginaryPart;
	
	public Complex() {
		
		this(0.0,0.0);
		
	}
	
	public Complex(double real,double imaginary) {
		this.realPart = real;
		this.imaginaryPart = imaginary;
	}
	
	
	public double subtractRealPart(double x1,double x2) {
		double realPart = x1 - x2;
		return realPart;
	}
	
	public  double subtractImaginaryPart(double x1,double x2) {
		double imaginaryPart = x1 - x2;
		return imaginaryPart;
	}
	
	public double addRealPart(double x1,double x2) {
		double realPart = x1 + x2;
		return realPart;
	}
	
	public double addImaginaryPart(double y1,double y2) {
		double imaginaryPart = (y1 + y2);
		return imaginaryPart;
	}
	public void setRealPart(double real) {
		this.realPart = real;
	}
	
	public void setImaginaryPart(double imaginary) {
		this.imaginaryPart = imaginary;
	}
	

	
	public void convertStringToInt(String value,String value2) {
		String numx1 = ""+value.charAt(0);
		String numx2 = ""+value2.charAt(0);
		String numy1 = ""+value.charAt(4);
		String numy2 = ""+value2.charAt(4);
		double x1 = Integer.parseInt(numx1);
		double x2 = Integer.parseInt(numx2);
		double y1 = Integer.parseInt(numy1);
		double y2 = Integer.parseInt(numy2);
		
		System.out.println("The sum of two complex numbers is: "+addRealPart(x1,x2) + " + " +addRealPart(y1,y2) + "i");
		System.out.println("The difference of two complex numbers is: "+subtractRealPart(x1,x2)+ " + " +subtractImaginaryPart(y1,y2) + "i");
		
		
	}

}
