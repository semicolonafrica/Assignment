package chapter10.exercise10_13;

public class Cube extends ThreeDimensionalShape{
	
	private int length; 

	public Cube(int length, int breadth, int height) {
		
		super(length, breadth, height);
		
	}

	public int getLength() {
		
		return length;
		
	}

	public void setLength(int length) {
		
		this.length = length;
		
	}
	
	@Override
	public double getArea() {
		
		return 6 * Math.pow(getLength(), 2);
	}
	
	@Override
	public double getVolume() {
		
		return Math.pow(getLength(), 3);
		
	}
	
	@Override
	public String toString() {
		return String.format("%s: %.2f%n%s: %.2f%n", 
				"The Surface area of Cube",getArea(), 
				"The Volume of Cube", getVolume());
	}
	
}
