package chapter10.exercise10_13;

public class ThreeDimensionalShape extends Shape{

	private int length;
	private int breadth;
	private int height;
	
	
	public ThreeDimensionalShape(int length, int breadth, int height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
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
	public double getArea() {
		return getLength() * getBreadth();
	}
	
	@Override
	public double getVolume() {
		return getLength() * getBreadth() * getHeight();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %.2f%n%s: %.2f%n", 
				"The area of Three dimensional Shape", 
				getArea(),"The area of Three dimensional Shape"
				, getVolume());
	}
	
}
