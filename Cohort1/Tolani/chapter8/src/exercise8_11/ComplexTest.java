package exercise8_11;

import java.util.Scanner;

public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner insert= new Scanner(System.in);
		
		Complex findComplexNumber = new Complex();
		System.out.println("Enter first complex number in the form (a + bi)");
		String value = insert.nextLine();
		System.out.println("Enter second complex number in the form (a + bi)");
		String value2 = insert.nextLine();
		
		findComplexNumber.convertStringToInt(value, value2);
		
		
		
		
		

	}
	
	

	
}
