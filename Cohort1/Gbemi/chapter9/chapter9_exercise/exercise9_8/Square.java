package exercise9_8;

public class Square extends Quadrilateral {
	public Square(Point point1, Point point2, Point point3, Point point4) {
		
		super(point1, point2, point3, point4);
	}
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
}
