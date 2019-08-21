package chapter8;

public class HugeInteger {

	private int[] number_array;
	private final int NUM = 40;
	private boolean positive;
	
	//Providing a no-argument constructor
	public HugeInteger() {
		number_array = new int[NUM];
		positive = true;
	}
	
	//Provide a method parse that converts a string to integer 
	//and store the integer in the array number_array
	
	public void parse(String number_string) {
		char[] int_char = number_string.toCharArray();
		
		//check if input is a negative number
		if(int_char[0] == '-')
			positive = false;
		
		if(positive)
			number_array[NUM - int_char.length] = 
			int_char[0] - '0';
		
		// convert string to integer array
		for(int i = 1; i < int_char.length;i++) {
			number_array[NUM - int_char.length + i] = int_char[i] - '0';
		}
	}
	
	
	
}
