package chapter6.exercise68;

public class ParkingChargesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ParkingCharges.calculateCharges();
		double total =0 ;
		
		total += ParkingCharges.calculateCharges();
		
		System.out.printf("Current charges %f%n Total %f%n", ParkingCharges.calculateCharges(), total);
		 
	}

}
