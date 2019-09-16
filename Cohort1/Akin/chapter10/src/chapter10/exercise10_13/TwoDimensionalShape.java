package chapter10.exercise10_13;

public class TwoDimensionalShape extends Shape{

	private int length;
	private int breadth;
	TwoDimensionalShape(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		return getLength() * getBreadth();
	}
	
	@Override
	public String toString() {
		
		return String.format("%s: %.2f%n", 
				"The area of a Two Dimensional Shape",
				getArea());
		
	}
}
