package exercise8_11;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ComplexNumberTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		try {
		System.out.println("enter the first complex number");
		double value1= input.nextDouble();
		double value2= input.nextDouble();
		double []value= {value1,value2};
		
		System.out.println("enter the second complex number");
		double val1= input.nextDouble();
		double val2= input.nextDouble();
		double []val= {val1,val2};
		ComplexNumber number=new ComplexNumber(value,val);
		number.addComplex();
		number.subtractComplex();
		}
		catch(InputMismatchException e){
			System.out.println("enter a floating point number");
			
		}
		
		
		
		input.close();

	}
	

}
