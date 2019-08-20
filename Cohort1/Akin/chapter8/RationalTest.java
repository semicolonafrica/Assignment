package chapter8;
import java.util.Scanner;
public class RationalTest {
	public static Scanner input = new Scanner( System.in ); 
	public static void main(String[] args) {
		
	      int numerator; // the numerator of a fraction   
	      int denominator; // the denominator of a fraction   
	      int digits; // digits to display in floating point format   
	      Rational rational1; // the first rational number   
	      Rational rational2; // second rational number   
	      Rational result; // result of performing an operation   
	   
	      // read first fraction   
	      System.out.print( "Enter numerator 1: " );   
	      numerator = input.nextInt();   
	      System.out.print( "Enter denominator 1: " );   
	      denominator = input.nextInt();   
	      rational1 = new Rational( numerator, denominator );   
	         
	      // read second fraction   
	      System.out.print( "Enter numerator 2: " );   
	      numerator = input.nextInt();   
	      System.out.print( "Enter denominator 2: " );   
	      denominator = input.nextInt();   
	      rational2 = new Rational( numerator, denominator );   
	   
	      System.out.print( "Enter precision: " );   
	      digits = input.nextInt();   
	   
	      int choice = getMenuChoice(); // user's choice in the menu   
	         
	      while ( choice != 5 )   
	      {   
	         switch ( choice )   
	         {   
	            case 1:   
	               result = rational1.sum( rational2 );   
	               System.out.printf( "a + b = %s = %s\n",   
	                  result.toString(),   
	                  result.toFloatString( digits ) );   
	               break;   
	   
	            case 2:   
	               result = rational1.subtract( rational2 );   
	               System.out.printf( "a - b = %s = %s\n",   
	                  result.toString(),   
	                  result.toFloatString( digits ) );   
	               break;   
	   
	            case 3:   
	               result = rational1.multiply( rational2 );   
	               System.out.printf( "a * b = %s = %s\n",   
	                  result.toString(),   
	                  result.toFloatString( digits ) );   
	               break;   
	                  
	            case 4:   
	               result = rational1.divide( rational2 );   
	               System.out.printf( "a / b = %s = %s\n",   
	                  result.toString(),   
	                  result.toFloatString( digits ) );   
	               break;   
	         } // end switch   
	            
	         choice = getMenuChoice();   
	      } // end while   
	   } // end main   
	      
	   // prints a menu and returns a value corresponding to the menu choice   
	   private static int getMenuChoice()   
	   {      
	         
	      System.out.println( "1. Add" );   
	      System.out.println( "2. Subtract" );   
	      System.out.println( "3. Multiply" );   
	      System.out.println( "4. Divide" );   
	      System.out.println( "5. Exit" );   
	      System.out.print( "Choice: " );   
	         
	      return input.nextInt();   
	   } // end method getMenuChoice 	

	}


