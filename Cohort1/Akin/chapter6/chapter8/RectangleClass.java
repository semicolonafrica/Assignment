package chapter8;

public class RectangleClass {

	private double width = 1;
	private double length = 1;
	
	public RectangleClass(double width, double length) {
		
		if(width > 0.0 && width < 20.0 || length > 0.0 && length < 20.0) {
			
			//throw new IllegalArgumentException("Length and Width was out of Range for 0.0 - 20.0");
			
			this.width = width;
			this.length = length;
		}

		
	}
	
	public void setLength( double length) {
		this.length = length;
		
	}
	
	public double getLength() {
		 return length;
	}
	
	public void setWidth( double width) {
		this.length = width;
		
	}
	
	public double getwidth() {
		 return length;
	}
	
	public double calcPerimeter() {
		
		double perimeter;
		
		perimeter = 2 * (length + width);
		
		return perimeter;
		
	}
	
	public double calcArea() {
		
		double area;
		
		area = length * width;
		
		return area;
		
	}
	
	public String toString() {
		
		return "\n" + "The perimeter: " + calcPerimeter() + "" + "\n" +"The Area: " + calcArea();
	}



	public void twoValue(double length, double width) {
		
		this.length = length;
		this.width = width;
		
	}
	
}
