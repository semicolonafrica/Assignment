package even;

public class EvenApp {
	public void detectEven(int number) {
		boolean result = EvenUtil.isEven(number);
		if(result == true) {
			System.out.println("Divisible by 2");
		}
		else {
			System.out.println("it is odd");
		}
	}

}
