package exercise9_8;

public class Square extends Parallelogram {

	public Square(Point pointA, Point pointB, Point pointC, Point pointD) {
		super(pointA, pointB, pointC, pointD);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double distanceBetweenTwoPoint(Point X, Point Y) {
		double distance = 0.0;
		if(equalXcordinates(X,Y) == true) {
			distance = super.distanceBetweenTwoPoint(X, Y);
		}
		return distance;
		
		
	}
	
	public boolean equalXcordinates(Point X,Point Y) {
		if(X.getCordinateX() == Y.getCordinateX()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	@Override
	public double calculateArea() {
		double area = distanceBetweenTwoPoint(getPointA(),getPointB()) * distanceBetweenTwoPoint(getPointC(),getPointD());
		return area;
	}

}
