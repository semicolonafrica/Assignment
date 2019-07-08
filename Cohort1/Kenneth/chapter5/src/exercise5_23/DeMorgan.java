package exercise5_23;

public class DeMorgan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 2, y = 4, a = 5, g = 4, j =2, b = 8, i =1;
		
		System.out.println("For the first expression.");
		
		System.out.println(!(x < 5) && !(y >= 7));
		System.out.println(!(x < 5 || y >= 7));
		System.out.println();
		
		
		System.out.println("For the second expression.");
		
		System.out.println(!(a == b) || !(g != 5));
		System.out.println(!(a == b && g != 5));
		System.out.println();
		
		
		System.out.println("For the third expression.");
		
		System.out.println(!((x <= 8) && (y > 4)));
		System.out.println(!(x < 8) || ! (y > 4));
		System.out.println();
		
		
		System.out.println("For the fourth expression.");
		System.out.println(!((i > 4) || (j <= 6)));
		System.out.println(!(i > 4) && !(j <= 6));
		System.out.println();
		

	}

}
