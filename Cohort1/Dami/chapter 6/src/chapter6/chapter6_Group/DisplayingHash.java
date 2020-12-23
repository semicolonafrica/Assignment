package chapter6.chapter6_Group;
import java.util.Scanner;
public class DisplayingHash {
	
	
	public static char squareOfHash(char y) {
			Scanner input = new Scanner(System.in);
			if(y == 0) {
				System.out.println("Number cannot be 0. Try again!");
				y = input.next().charAt(0);
			}
			if(y % 2 == 1) {
				System.out.println("Nah! Even numbers only. Try again!");
				y = input.next().charAt(0);
			}
			for(int i = 1; i <= y; i++) {
				for(int a = 1; a <= y; a++) {
					System.out.print("#");
				}
				System.out.println();
			} return y;
		}
	}



