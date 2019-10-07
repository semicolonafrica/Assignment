package exercise10_13;

public class Square extends TwoDimensional {
	private double length;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double calArea() {
		return length*length;
	}
	
	
	public String toString() {
		return String.format("%s%n%.2fSquare", super.toString(),calArea());
	}

}
