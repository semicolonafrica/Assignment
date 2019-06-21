package chapter5.exercise532;

import java.util.Scanner;
public class FairTax {

	public void taxed() {
		double tax = 0;
		double total = 0;
		double consumption = 0;
		//int category = 0;
		for(int i=1; i<=10; i++) {
			Scanner input = new Scanner(System.in);
			if (i == 1) {
			System.out.println("Housing: ");
			int category1 = input.nextInt();
			tax = (0 * category1);
			total += tax;
			}
			
			if (i == 2) {
			System.out.println("Food: ");
			int category2 = input.nextInt();
			tax = (0*category2);
			total += tax;
			}
			
			if (i==3) {
			System.out.println("Clothing: ");
			int category3 = input.nextInt();
			tax = (0*category3);
			total += tax;
			}
			
			if(i ==4) {
			System.out.println("Heat: ");
			int category4 = input.nextInt();
			tax = (0*category4);
			total += tax;
			}
			
			if (i ==5) {
			System.out.println("Health care: ");
			int category5 = input.nextInt();
			tax = (0*category5);
			total += tax;
			}
			
			if(i ==6 ) {
			System.out.println("Education: ");
			int category6 = input.nextInt();
			tax = (0.23*category6);
			total += tax;
			}
			
			if (i ==7) {
			System.out.println("Vacations: ");
			int category7 = input.nextInt();
			tax = (0.23*category7);
			total += tax;
			}
			
			if(i==8) {
			System.out.println("Transportation: ");
			int category8 = input.nextInt();
			tax = (0.23*category8);
			total += tax;
			}
			
			if (i ==9) {
			System.out.println("Household: ");
			int category9 = input.nextInt();
			tax = (0.23*category9);
			total += tax;
			}
			
			if(i == 10) {
			System.out.println("Others: ");
			int category10 = input.nextInt();
			tax = (0.23*category10);
			total += tax;
			}
		}
		System.out.println("Estimated Fairtax you are to pay: " + "$" + total );
	}
}
