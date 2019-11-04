package exercise10_13;

public class Square extends Two_DimensionalShape {
	private double length;
	
	private double breadth;
	
	public Square(double length,double breadth) {
		if(length != breadth) {
			throw new IllegalArgumentException("Length of a square must be equal to the breadth");
		}
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if(length != breadth) {
			throw new IllegalArgumentException("Length of a square must be equal to the breadth");
		}
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		if(length != breadth) {
			throw new IllegalArgumentException("Length of a square must be equal to the breadth");
		}
		this.breadth = breadth;
	}
	
	public double getArea() {
		if(length != breadth) {
			throw new IllegalArgumentException("Length of a square must be equal to the breadth");
		}
		else {
			return length * breadth;
		}
	}
}
