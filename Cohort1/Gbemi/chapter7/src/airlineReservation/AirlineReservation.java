/**
 * 
 */
package airlineReservation;

/**
 * @author User
 *
 */
import java.util.Scanner;
public class AirlineReservation {
	
	private static boolean [] flight= new boolean [10];
	
	public static boolean getFirstClass() {
		
		for(int first=0;first<5;first++) {
			
			if (flight[first]==false) {
				System.out.println("You book FirstClass"
						+ "your Boarding pass is"+first);
				flight[first]=true;
				return true;
			}
		}
		return false;
	}
	
	public static boolean getEconomy() {
		for(int second=5;second<10;second++) {
			
			if(flight[second]==false) {
				
				System.out.println("You book Economy"
						+ "your Boarding pass is"+second);
				flight[second]=true;
				return true;
				
			}
		}
		return false;
	}
	public static void display() {
		
		
		Scanner input = new Scanner(System.in);
		
		for(int count=0;count<10;count++) {
		System.out.println("enter 1 for First Class or 2 for Economy");
		int value=input.nextInt();
		
		if(value==1) {
			
			
			boolean first=getFirstClass();
			
			if(first==true) {
				System.out.println("Thank you!!!");
			}
				else 
				{
					System.out.println("First class is full,would you like to book for Economy.. enter 1 for yes or 2 for no,");
					int value2=input.nextInt();
					if(value2==1) {
						boolean second=getEconomy();
						if(second==true) {
							System.out.println("Thank you!!!");
						}
					}
					else {
							System.out.println("The next Flight leaves in 3hours");
					}
					
					
					
				}
			}
		
		else if(value==2) {
			
			boolean second = getEconomy();
			if(second==true) {
				System.out.println("Thank you");
				
			}
			else {
				System.out.println("Economy is full, would you like to book for First Class");
				int value3= input.nextInt();
				
				if(value3==1) {
				
				boolean first=getFirstClass();
				if(first==true) {
					System.out.println("Thank you");
				}
				}
				else {
					System.out.println("The next Flight leaves in 3hours");
				}
			}
			
			
			
		}
		
		}
	}
	
	public static void main(String[] args) {
		display();
	}

}
