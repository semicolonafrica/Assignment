package exercise9_8;

public class Rectangle extends Quadrilateral{
	
	private double length;
	private double breath;
	private double area;
	
	
	
	public double getLength() {
		return length;
	}





	public void setLength(double length) {
		this.length = length;
	}





	public double getBreath() {
		return breath;
	}





	public void setBreath(double breath) {
		this.breath = breath;
	}
	
	





	public Rectangle(Point point1, Point point2, Point point3, Point point4) {
		super(point1, point2, point3, point4);
		
		
	}
	
	
	
	
	
@Override
public double calArea() {
	
	area = length*breath;
	return area;
	
}
		
	
}
