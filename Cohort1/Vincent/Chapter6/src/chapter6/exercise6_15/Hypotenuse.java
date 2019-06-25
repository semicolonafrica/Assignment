package chapter6.exercise6_15;


//Define a method hypotenuse that
//exponent
//calculates the hypotenuse of a right triangle when the lengths of the other
//two sides are given. The method should take two arguments of type
//double and return the hypotenuse as a double. Incorporate this method
//into an application that reads values for side1 and side2 and performs
//the calculation with the hypotenuse method. Use Math methods pow
//and sqrt to determine the length of the hypotenuse for each of the
//triangles in Fig. 6.14 . [Note:Class Math also provides method hypot to
//perform this calculation.



public class Hypotenuse { 
	
	
	
	public static double calculateHypotenuse( double side1, double side2) {
		

		double squareside2 = Math.pow(side2, side1 );
	
		double hypotenuse =  squareside2;
			hypotenuse = Math.sqrt(hypotenuse);
	
			System.out.println(hypotenuse);
			return hypotenuse;
				
}
		
		
}