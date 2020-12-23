package circleArea;
import java.util.Scanner;

public class AreaTest {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Radius: ");
		double radius = input.nextDouble();
		
		System.out.print(Area.circleArea(radius));
	}

}
