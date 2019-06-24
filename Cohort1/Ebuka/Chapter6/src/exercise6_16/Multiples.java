package exercise6_16;

// @author CHIMA CHUKWUEBUKA
 import java.util.Scanner;
public class Multiples {

	// @param args
	public static boolean isMultiple(int x, int y) {
		
		if(y % x == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner multi = new Scanner(System.in);
		 System.out.println("Enter First Number: ");
		 int input1 = multi.nextInt();
		 
		 System.out.println("Enter Second Number: ");
		 int input2 = multi.nextInt();
		 
		 System.out.println(isMultiple(input1, input2));

	}

}
