package exercise6_23;
import java.util.Scanner;


public class MinimumTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter integer 1");
		int a = input.nextInt();
		System.out.println("please enter integer 2");
		int b = input.nextInt();
		System.out.println("please enter integer 3");
		int c = input.nextInt();
		System.out.println(Minimum.minimum(a,b,c));
		
		


	}

}
