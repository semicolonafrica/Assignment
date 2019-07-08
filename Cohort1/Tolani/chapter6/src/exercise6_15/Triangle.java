package exercise6_15;

public class Triangle {
	
	public double hypotenuse(double side1,double side2) {
		double add = Maths.square(side1) + Maths.square(side2);
		double hypotenuse = Maths.squareRoot(add);
		return hypotenuse;
	}

}
