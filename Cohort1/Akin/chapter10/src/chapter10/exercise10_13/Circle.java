package chapter10.exercise10_13;

public class Circle extends TwoDimensionalShape{

	private int radius;

	public Circle(int length, int breadth) {
		super(length, breadth);
	}
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override 
	public double getArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}
	
	@Override
	public String toString() {
		return String.format("%s: %.2f%n", 
				"The area of a Circle", 
				getArea());
	}
}
