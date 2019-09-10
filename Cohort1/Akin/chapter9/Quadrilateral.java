package chapter9;

public class Quadrilateral {

	private Point first; 
	private Point second;
	private Point third;
	private Point fourth;
	
	public Quadrilateral(Point first,Point second,Point third,Point fourth) {
		this.first = first;
		this.second = second;
		this.third = third;
		this.fourth = fourth;
	}
	
	public Point getFirst() {
		return first;
	}



	public void setFirst(Point first) {
		this.first = first;
	}



	public Point getSecond() {
		return second;
	}



	public void setSecond(Point second) {
		this.second = second;
	}



	public Point getThird() {
		return third;
	}



	public void setThird(Point third) {
		this.third = third;
	}



	public Point getFourth() {
		return fourth;
	}



	public void setFourth(Point fourth) {
		this.fourth = fourth;
	}

	
	
	public double area() {
		double length = 1;
		double breadth = 1;
		double area = length * breadth;
		return area;
	}
//	
//	public String toString() {
//		return String.format("%s: %.2f%n", "Area of a Quadrilateral", area());
//	}
	
	
	
}
