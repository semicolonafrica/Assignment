package exercise632;
import java.util.Scanner;

public class DistancePoint {
	public static void calculateDistance() {
		Scanner input = new Scanner(System.in);
		double distance;
		
		System.out.println("Enter the x2 point: ");
		int x2 = input.nextInt();
		
		System.out.println("Enter the x1 point: ");
		int x1 = input.nextInt();
		
		System.out.println("Enter the y2 point: ");
		int y2 = input.nextInt();
		
		System.out.println("Enter the y1 point: ");
		int y1 = input.nextInt();
		
		 distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2-y1) * (y2-y1));
		 
		 System.out.println("Distance point of : " +x1+" "+x2+" "+y1+" "+y2+" "+ "And the Total distance is: " +distance+" ");
		 
		 
		input.close();
	}
	

	public static void main(String[] args) {
		 DistancePoint.calculateDistance();
	

	}

}
