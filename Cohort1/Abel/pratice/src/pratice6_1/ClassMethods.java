package pratice6_1;

public class ClassMethods {
	public static int getdClass() {
		int x = 50;
		int y = 0;
		Maths.sqrt(x);
		int total = Maths.sqrt(900);
		System.out.println(total);
		return total;
	}
	

	public static void main(String[] args) {
		ClassMethods.getdClass();
	
	}

}
