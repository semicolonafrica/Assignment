package chapter8.exerecise8_4;


//(Rectangle Class) Create a class Rectangle with attributes length and width, each of which
//defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
//methods for both length and width. The set methods should verify that length and width are each
//floating-point numbers larger than 0.0 and less than 20.0.Write a program to test class Rectangle.
 
public class Rectangle {

	private double length;
	private double width;
//	public Rectangle(double length, double width) {
//		this.length = length;
//		this.width = width;
//	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		
		if(length > 0.0 && length <= 20.0) {
			this.length = length;
		}
		else {
			System.out.println("number not valid ");
		}
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
	
		if(width > 0.0 && width <= 20.0) {
			this.width = width;
		}
		else {
			System.out.println("number not valid ");
	}
	}
	    public void calculatePerimeter() {
			
			double parimeter = 2 * (getWidth() + getLength());
			System.out.printf("perimeter is: %.1f%n", parimeter);
		
	}	
		public void calculateArea() {
			
			double area = 2 * getWidth() * getLength();
			System.out.printf("area is: %.1f", area);
			
		
		}
			
	

			
	}	
					
			
	

