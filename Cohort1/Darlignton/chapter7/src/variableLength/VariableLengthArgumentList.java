package variableLength;


import java.util.Scanner;

public class VariableLengthArgumentList {

	
	public static int product(int... number) {
		
		int product_ =1;
		
		for(int i = 0; i< number.length; i++) {
			
			product_ = product_ * number[i];
		}
		return product_;
		
	} 
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount of number you want to input");
		int numberOfTimes = input.nextInt();
		int number = 0;
		
		int[] array = new int[numberOfTimes];
		
		
		System.out.println("Enter Numbers");
		
		for(int i = 0; i< array.length; i++) {
			number = input.nextInt();
			array[i] = number;
		}
		
		System.out.println(product(array));
		
		input.close();
		
	}

}