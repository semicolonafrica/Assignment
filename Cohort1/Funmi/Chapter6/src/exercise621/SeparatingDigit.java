package exercise621;

public class SeparatingDigit {
	
	public static int getdivide(int a, int b) {
		int store = a/b;
		return store;
	}
	public static int getremainder(int a, int b) {
		int store = a % b;
		return store;
	}

	public static void displayDigit(int number) {
		String space = "";
		int total = 0;
		
		if(number >= 1 && number <= 100000) {
			while(number != 0) {
				total = getremainder(number,10);
				 space = total + "  " + space;
				 
				 number = getdivide(number,10);
				 
			}
			System.out.println(space);
		}
		else {
			System.out.println("this number is Novalid! try again: ");
		}
	}
}
