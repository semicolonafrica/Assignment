package exercise4_36;
import java.util.Scanner;
public class SidesFoATriangle {
	
	public int SidesOfATriangle(int triangle) {
		int x = 0; int y = 0; int z = 0;
		if(x != 0 & y != 0 & z != 0) {
			triangle = x * y * z;
			System.out.print("values given are sides of a triangle");
		}
		else {
			System.out.print("values given are not sides of a triangle");
		}
		return triangle;		
	}
	
public static void main(String[] args) {
		SidesFoATriangle sides = new SidesFoATriangle();
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter values for the Triangle: ");
		int value = in.nextInt();
		int value1 = in.nextInt();
		int value2 = in.nextInt();
		
		System.out.println(sides.SidesOfATriangle(0));
	}

}
