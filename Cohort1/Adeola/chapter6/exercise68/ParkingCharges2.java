package exercise68;
	import java.util.Scanner;

public class ParkingCharges2 {
	static Scanner input = new Scanner(System.in);
static double totalCharges = 0;
public static double calculateCharges() {
	
	System.out.println("enter number of hours spent");
	int hours= input.nextInt();
	double charges = 2;
	//charges when the number of hours is more than 3
	if(hours>3) {
		charges=2 + (0.5*(hours-3));
	}
	// when charges is greater than $10 
	if(charges > 10) {
		charges = 10;
	}
	System.out.println("charges for this customer is:"+ charges);
	return charges;
}
public static void multipleCharges() {
	int i=1;

	System.out.println("enter number of customers for yesterday");
	int a = input.nextInt();
	System.out.println("enter number of hours for each customer for yesterday ");
	for(int b =1 ; b<=a; b++) {
		System.out.println("enter for customer"+ b);

		totalCharges = totalCharges + calculateCharges();
	}
	double yesterdayCharges = totalCharges;
	System.out.println("total charges for all customers for yesterday : "+totalCharges);
	
	System.out.println("enter number of hours for each customer for today");

	while(input.hasNext()) {
		
		System.out.println("enter for customer"+ i+ "  or ctrl Z to enter for yesterday");

		totalCharges = totalCharges + calculateCharges();
		i++;
	}
	double todayCharges = totalCharges - yesterdayCharges;
	System.out.println("today's total charges is"+ todayCharges);
	
	
	System.out.println("total charges for all customers so far: "+totalCharges);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multipleCharges();

	}

}
