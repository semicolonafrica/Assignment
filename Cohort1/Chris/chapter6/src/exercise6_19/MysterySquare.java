package exercise6_19;

import java.util.Scanner;

public class MysterySquare {
	
	public static void mystery(char fill, int size) {
		
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size; j++) {
				System.out.print(" "+fill);
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter fill: ");
		char fill = input.next().charAt(0);
		
		System.out.print("Enter size:");
		int size = input.nextInt();
		System.out.println();
		mystery(fill, size);
		

}
}
