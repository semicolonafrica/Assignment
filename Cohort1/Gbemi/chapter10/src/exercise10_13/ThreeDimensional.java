package exercise10_13;

public class ThreeDimensional extends Shape {
	
	private double area;
	private double volume;
	
	
	public double calArea() {
		return area;
	}
	
	public double calVolume() {
		return volume;
	}
	
	public String toString() {
		return String.format("this is a three dimensional shape");
	}

}
