package exercise6_17;

import java.util.Scanner;

public class EvenOrOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner insert = new Scanner(System.in);
		//System.out.println("Enter number: ");
		int num = 0;
		while(num != -1) {
			System.out.println("Enter number: ");
			num = insert.nextInt();
			if(EvenOrOdd.isEven(num)== true) {
				System.out.println(num + " is even");
			}
			else if(num!=-1) {
			System.out.println(num+ " is odd");
			}
		}
		
		insert.close();

	}

}
