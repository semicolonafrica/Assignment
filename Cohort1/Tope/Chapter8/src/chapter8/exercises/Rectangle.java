package chapter8.exercises;
//Exercise 8.4
//Program written by Oyemade Temitope
//22nd of July 2019

public class Rectangle {
	
	private double length;
	private double width;
	
	
	public Rectangle(double length, double width) {
		
		if(length <= 0.0 || length > 20.0 || width <= 0.0  || width >20.0) 
			throw new IllegalArgumentException();
		
		this.length = length;
		this.width = width;
	}
	
	public void setLength(double length) {
		
		if(length <= 0.0 || length > 20.0)
			throw new IllegalArgumentException();
			
		this.length = length;
	}
	
	public void setWidth(double width) {
		
		if( width <= 0.0  || width >20.0)
			throw new IllegalArgumentException();
		
		this.width = width;
	}
	
	
	public double getLength() {
		return length;
	}
	
	
	
	public double getWidth() {
		return width;
	}
	
	
	public double calculatePerimeter() {
		
		
		return 2*(length + width);
	}
	
	public double calculateArea() {
		
		return width * length;
	}
	

	

}
