package chapter10.exercise10_13;

public abstract class Shape {
	
	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public abstract double getArea();
	
	public double getVolume() {
		return getLength() * getLength() * getLength();
	}
	
	public String toString() {
		return String.format("%s:  %.2f and %s: %.2f%n", 
				"Area of the Shape",
				getArea());
	}
}
