/**
 * 
 */
package exercise9_8;

/**
 * @author user
 *
 */
public class Quadrilateral {
	
	private Point pointA;
	
	private Point pointB;
	
	private Point pointC;
	
	private Point pointD;
	
	public Quadrilateral() {
		
	}
	
	public Quadrilateral(Point pointA,Point pointB,Point pointC,Point pointD) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
	}
	
	public void setPointA(Point A) {
		this.pointA = A;
	}
	
	public Point getPointA() {
		return pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	public double distanceBetweenTwoPoint(Point X, Point Y) {
		 double distance = Math.sqrt(Math.pow((Y.getCordinateX()-X.getCordinateX()),2) + Math.pow((Y.getCordinateY()- X.getCordinateY()),2));
//		 System.out.println(distance);
		 return distance;			
		
	}
	
	public double calculateArea() {
		double area = distanceBetweenTwoPoint(getPointA(),getPointB()) * distanceBetweenTwoPoint(getPointC(),getPointD());
		return area;
	}
	
	
	
	
	
	
	
	
	
	
}
