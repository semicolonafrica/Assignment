package exercise7_14;

import java.util.Scanner;

public class VariableLengthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 2;
		int num2 = 5;
		int num3 = 4;
		int num4 = 1;
		
		System.out.println("The product for num1 and num3 is: " +VariableLength.calculateProduct(num1,num3));
		
		System.out.println("The product for num2 and num3 is: " +VariableLength.calculateProduct(num2,num3));
		
		System.out.println("The product for num4 and num3 is: " +VariableLength.calculateProduct(num4,num3));
		
		System.out.println("The product for all numbers is: " +VariableLength.calculateProduct(num1,num2,num3,num4));
	}

}
