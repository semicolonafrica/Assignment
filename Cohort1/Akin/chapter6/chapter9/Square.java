package chapter9;

public class Square extends Quadrilateral{

	private double length;
	private double breadth;
	
	public Square(Point first,Point second,Point third, Point fourth) {
		super(first,second,third,fourth);
	}
	
	public double diffX1() {
		return Math.pow(getFirst().getX() - getSecond().getX(),2);
	}
	
	public double diffX2() {
		return Math.pow(getThird().getX() - getFourth().getX(),2);
	}
	public double diffY1() {
		return Math.pow(getFirst().getY() - getSecond().getY(),2);
	}
	
	public double diffY2() {
		return Math.pow(getThird().getY() - getFourth().getY(),2);
	}
	
	public double diffX3() {
		return Math.pow(getFirst().getX() - getThird().getX(),2);
	}
	
	public double diffY3() {
		return Math.pow(getFirst().getY() - getThird().getY(),2);
	}
	
	public double diffX4() {
		return Math.pow(getSecond().getX() - getFourth().getX(),2);
	}
	
	public double diffY4() {
		return Math.pow(getSecond().getY() - getFourth().getY(),2);
	}
	
	public double getDistanceAB() {
		return Math.sqrt(diffX1() + diffY1());
	}
	
	public double getDistanceCD() {
		return Math.sqrt(diffX2() + diffY2());
	}
	
	public double getDistanceAC() {
		return Math.sqrt(diffX3() + diffY3());
	}
	
	public double getDistanceBD() {
		return Math.sqrt(diffX4() + diffY4());
	}

	@Override
	public double area() {
		return getDistanceAB() * getDistanceCD();
	}
	
	@Override
	public String toString() {
		
		return String.format("%s: %.2f%s%n", "The area of a Square", area(),"m2");
		
	}
}
