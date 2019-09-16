package chapter10.exercise10_13;

public class Tetrahedron extends ThreeDimensionalShape{
	
	private int length;
	private int breadth;
	private int height;

	public Tetrahedron(int length, int breadth, int height) {
		
		super(length, breadth, height);
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public double getVolume() {
		double part = 0.083333 * Math.sqrt(2) * Math.pow(getLength(), 3);
		
		return part;
	}
	
	@Override
	public double getArea() {
		
		double part = Math.sqrt(3) * Math.pow(getLength(), 2);
		
		return part;
		
	}
	
	@Override
	public String toString() {
		return String.format("%s: %.2f%n%s: %.2f%n", 
				"The Surface area of Tetrahedron",getArea(), 
				"The Volume of Tetrahedron", getVolume());
	}
	
	
}
