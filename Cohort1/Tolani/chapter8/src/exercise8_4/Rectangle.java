package exercise8_4;

public class Rectangle {
	
	private double length;
	
	private double width;
	
	public Rectangle(double length,double width) {
		this.length =length;
		this.width = width;
	}
	public double getLength() {
		
		return length;
	}
	
	public void setLength(double length) {
		
		if(length > 0.0 && length < 20.0 ) {
			
			this.length = length;
			
		}
		
		
	}
	
	
	public double getWidth() {
		
		return width;
	}
	public void setWidth(double width) {
		
		if(width > 0.0 && width < 20.0 ) {
			
			this.width = width;
		}
		
		
	}
	
	
	
	
	public double calculateArea() {
		
		double area = getLength() * getWidth(); 
		
		return area;
	}
	
	public double calculatePerimeter() {
		
		double perimeter = 2.0 * (getLength() + getWidth()); 
		
		return perimeter;
	}
	
	
}
