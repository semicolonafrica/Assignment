package chapter8.exercises;

public class Rectangle {	
	/*(Rectangle Class) Create a class Rectangle with attributes length and width, each of which
	defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
	methods for both length and width. The set methods should verify that length and width are each
	floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.**/
	private double length = 1.0;
	private double width = 1.0;
	 
	 public Rectangle(double length, double width) {
		 if(length == 0.0 || length >= 20.0) 
			 throw new IllegalArgumentException("length must be 0.1 - 19.9");
		 
		 if(width == 0.0 || width >= 20.0) 
			 throw new IllegalArgumentException("width must be 0.1 - 19.9");
		 
		this.length = length;
		this.width = width;
	}	
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		
		if(length > 0.0 && length < 20.0) {
			this.length = length;
		}
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width > 0.0 && width < 20.0) {
			this.width = width;
		}
	}	
	public  void calculateArea() {		
		double area = length * width;
		System.out.println(area);
	}	
	public  void calculatePerimeter() {		
		double 	perimeter = 2*(length + width);
		System.out.println(perimeter);
	}	
	public  void getRectangle() {
		calculateArea();
		calculatePerimeter();
	}
}