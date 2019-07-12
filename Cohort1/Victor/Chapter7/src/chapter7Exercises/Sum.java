package chapter7Exercises;

public class Sum {
	
	public static void main(String[] args) {
		double number = 0;
		
		for(String numb : args) {
			number += Double.parseDouble(numb);
			}
		System.out.println(number);
	}
}
