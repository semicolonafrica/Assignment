package chapter6.chapter6_Group;
import java.util.Scanner;
public class MultiplesOperation {

	public static void main(String[] args) {
		Multiples obj = new Multiples();
		Scanner input = new Scanner(System.in);
		System.out.print("How many pairs of number do you want to check? ");
		int counter = input.nextInt();
		
		int first;
		int second;
		
		for(int i = 1; i <= counter; i++) {
			System.out.print("Type number: ");
			first = input.nextInt();
		
			System.out.print("Type number: ");
			second = input.nextInt();
		
			boolean check = Multiples.isMultiple(first, second);	
	}
	}

}
