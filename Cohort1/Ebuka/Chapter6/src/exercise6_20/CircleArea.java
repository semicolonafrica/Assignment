package exercise6_20;

	/**
	 * @author CHIMA CHUKWUEBUKA
	 *
	 */
import java.util.Scanner;
	public class CircleArea {
		
		public static double circle(double w) {
			
			double area = 1;
			for(int i =1; i <=2; i++) {
				area*= w;
			}
			
			 area = 3.712 * area;
			
			return area;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner radius = new Scanner(System.in);
			
			System.out.print("Enter radius: ");
			double w = radius.nextDouble();
			
			System.out.print("Radius Of a Circle " + w + " is "+ CircleArea.circle(w));

	}


}
