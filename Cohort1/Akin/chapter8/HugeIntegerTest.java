package chapter8;

import java.util.Scanner;

public class HugeIntegerTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		HugeInteger firstValue = new HugeInteger();   
	      
		HugeInteger secondValue = new HugeInteger();   
	   
	     System.out.print( "Enter first HugeInteger: " );   
	     firstValue.parse( input.next() );   
	         
	     System.out.print( "Enter second HugeInteger: " );   
	     secondValue.parse( input.next() );   
	   
	     System.out.printf( "HugeInteger 1: %s\n", firstValue.toString() );   
	     System.out.printf( "HugeInteger 2: %s\n", secondValue.toString() );   
	   
	      HugeInteger result;   
	   // add two HugeIntegers   
	      result = firstValue.add( secondValue );     
	      System.out.printf( "Add result: %s\n", result.toString() );   
	   
	      // subtract two HugeIntegers   
	      result = firstValue.subtract( secondValue );     
	      System.out.printf( "Subtract result: %s\n", result.toString() );   
	   
	      // compare two HugeIntegers   
	      System.out.printf(    
	         "HugeInteger 1 is zero: %b\n", firstValue.isZero() );   
	      System.out.printf(   
	         "HugeInteger 2 is zero: %b\n", secondValue.isZero() );   
	      System.out.printf(   
	         "HugeInteger 1 is equal to HugeInteger 2: %b\n",   
	         firstValue.isEqualTo( secondValue ) );   
	      System.out.printf(   
	         "HugeInteger 1 is not equal to HugeInteger 2: %b\n",    
	         firstValue.isNotEqualTo( secondValue ) );   
	      System.out.printf(   
	         "HugeInteger 1 is greater than HugeInteger 2: %b\n",    
	         firstValue.isGreaterThan( secondValue ) );   
	      System.out.printf(   
	         "HugeInteger 1 is less than HugeInteger 2: %b\n",    
	         firstValue.isLessThan( secondValue ) );   
	      System.out.printf(   
	         "HugeInteger 1 is greater than or equal to HugeInteger 2: %b\n",   
	         firstValue.isGreaterThanOrEqualTo( secondValue ) );   
	      System.out.printf(   
	         "HugeInteger 1 is less than or equal to HugeInteger 2: %b\n",   
	         firstValue.isLessThanOrEqualTo( secondValue ) );   
	   input.close();

	}

}
