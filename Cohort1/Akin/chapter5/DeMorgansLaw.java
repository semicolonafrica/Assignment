package chapter5.exercise518;

public class DeMorgansLaw {

	public static void main(String[] args) {
		
		int x = 7, y = 3, a = 12, b = 13, g = 1, i = 3,j = 8;
		
		//Equivalent Expression for each expression given
		
		// !(x < 5) && !(y >= 7) = !((x < 5) || (y >= 7))
		// !(a == b) || !(g != 5) = !((a == b) && (g != 5))
		// !((x <= 8) && (y > 4)) = !(x <= 8) || !(y > 4)
		// !((i > 4) || (j <= 6)) = !(i > 4) && !(j <= 6)
		
		//Application that displays
		
		System.out.println(!(x < 5) && !(y >= 7) == !((x < 5) || (y >= 7)));
		System.out.println((!(a == b) || !(g != 5)) == !((a == b) && (g != 5)));
		System.out.println(!((x <= 8) && (y > 4)) == !(x <= 8) || !(y > 4));
		System.out.println(!((i > 4) || (j <= 6)) == !(i > 4) && !(j <= 6));

		
	}

}
