package exercise8_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComplexNumberTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
//		Complex numbers = new Complex();
		
		try {
		System.out.println("Enter complex number values:(real, imaginary)");
		double real = input.nextDouble();
		double imaginary = input.nextDouble();
		
		double temp1 [] = {real, imaginary};
		
		System.out.println("Enter complex number values:(real, imaginary)");
		double real1 = input.nextDouble();
		double imaginary1 = input.nextDouble();
		
		double temp2 [] = {real1, imaginary1};

		Complex bamn = new Complex(temp1, temp2);
		
		System.out.println(bamn.addComplexNumbers());
		}
		catch(InputMismatchException e) {
			System.out.println("Error!! double value expected");
			
		}
	}

}
