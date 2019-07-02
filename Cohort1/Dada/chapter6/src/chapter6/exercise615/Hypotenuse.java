package chapter6.exercise615;

import java.util.Scanner;

public class Hypotenuse {

		public void calculateHypotenuse() {
			Scanner input = new Scanner(System.in);
			
			double temp;
			double temp2;
			double hypotenuse;
			

			System.out.println("Enter side1 or -1 to exit: ");
			double side1 = input.nextDouble();
			
			
			while(side1 != -1) {
			
				System.out.println("Enter side2: ");
				double side2 = input.nextDouble();
			temp = Math.pow(side1, 2);
			temp2 = Math.pow(side2, 2);
			hypotenuse = temp + temp2;
			
//			input.nextLine();
			
			System.out.println("side1\tside2\thypotenuse\t");
			System.out.println(side1 + "\t" + side2 + "\t" + hypotenuse);
			System.out.println("Enter side1 or -1 to exit: ");
			
			side1 = input.nextDouble();
			if(side1 == -1) {
				System.out.println("You exit from application ");
			}
			}
			
			
			
			
			
			
			
			
		}
}
