package even;

import java.util.Scanner;



public class EvenTest {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		EvenApp obj = new EvenApp();
		
		System.out.print("ENTER NUMBER: ");
		int number = input.nextInt();
		
		obj.detectEven(number);
	}

}
