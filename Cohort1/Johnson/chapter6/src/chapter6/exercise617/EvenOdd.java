package chapter6.exercise617;

public class EvenOdd {
	static enum Option{TRUE,FALSE};
	static Option a = Option.TRUE;
	static Option b = Option.FALSE;
	
	public static boolean isEven(int number) {
		if(number %2 == 0) {
			return true;
		}
		else {
			return false;		
		}
	}
	public static Option isEven1(int number) {
		if(number %2 == 0) {
			return a;
		}
		else {
			return b;		
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isEven(4));;
		System.out.println(isEven(678934));
		System.out.println(isEven(857));
		System.out.println(isEven(874));
		
		System.out.println("\n" + isEven1(4));;
		System.out.println(isEven1(678934));
		System.out.println(isEven1(857));
		System.out.println(isEven1(874));
	}

}
