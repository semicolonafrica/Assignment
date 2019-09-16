/**
 * 
 */
package chapter10.exercise10_13;

/**
 * @author akeens4
 *
 */
public class Sphere extends ThreeDimensionalShape{

	private int length;
	private int breadth;
	private int height;
	private int radius;
	
	public Sphere(int length, int breadth, int height, int radius) {
		super(length, breadth, height);
		this.radius = radius;
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
		
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		double part = Math.PI * Math.pow(getRadius(), 2);
		return 4 * part;
	}
	
	@Override
	public double getVolume() {
		double part = Math.PI * Math.pow(getRadius(), 3);
		return (4 / 3) * part;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %.2f%n%s: %.2f%n", 
				"The area of Sphere", 
				getArea(),"The Volume of Sphere",
				getVolume());
	}
}
