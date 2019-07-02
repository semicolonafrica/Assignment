package exercise6_17;

public class EvenOdd {
	public static boolean isEven(int number) {
		if(number %2 == 0) {
			return true;
		}
		else {
			return false;		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isEven(4));;
		System.out.println(isEven(678934));
		System.out.println(isEven(857));
		System.out.println(isEven(874));
	}

}
