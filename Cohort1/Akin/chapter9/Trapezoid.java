package chapter9;

public class Trapezoid extends Quadrilateral{
	
	Trapezoid(Point first,Point second,Point third,Point fourth) {
		super(first,second,third,fourth);
	}
	
	public double diffX1() {
		return Math.pow(getFirst().getX() - getSecond().getX(),2);
	}
	public double diffY1() {
		return Math.pow(getFirst().getY() - getSecond().getY(),2);
	}
	

	public double diffX2() {
		return Math.pow(getSecond().getX() - getThird().getX(),2);
	}
	
	public double diffY2() {
		return Math.pow(getSecond().getY() - getThird().getY(),2);
	}
	
	public double diffX3() {
		return Math.pow(getThird().getX() - getFourth().getX(),2);
	}

	public double diffY3() {
		return Math.pow(getThird().getY() - getFourth().getY(),2);
	}
	

	
	public double diffX4() {
		return Math.pow(getFourth().getX() - getFirst().getX(),2);
	}
	
	public double diffY4() {
		return Math.pow(getFourth().getY() - getFirst().getY(),2);
	}
	
	public double getDistanceAB() {
		return Math.sqrt(diffX1() + diffY1());
	}
	
	public double getDistanceBC() {
		return Math.sqrt(diffX2() + diffY2());
	}
	
	public double getDistanceCD() {
		return Math.sqrt(diffX3() + diffY3());
	}
	
	public double getDistanceDA() {
		return Math.sqrt(diffX4() + diffY4());
	}
	
	public double getHeight() {
		double base = getSecond().getX() - getFirst().getX();
		
		double height = Math.sqrt(Math.pow(getDistanceAB(), 2) - Math.pow(base, 2));
		return height;
	}
	@Override
	public double area() {
		double part = 0.5 * (getDistanceBC() + getDistanceDA()) * getHeight();
		return part;
		
	}
	
	@Override
	public String toString() {
		return String.format("%s %.2f%s%n", "Area of a Trapezoid: ", area(),"m2");
	}

}
