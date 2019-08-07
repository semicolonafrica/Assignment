package chapter8;

import java.util.Scanner;

public class SetOfIntegersTest {

	public static void main(String[] args) {
		
		//initialize two sets
		System.out.println( "Input Set A" );
		SetOfIntegers firstSet = inputSet();
		
		
		
		System.out.println( "Input Set B" );
		SetOfIntegers secondSet = inputSet();

		SetOfIntegers union = firstSet.union(secondSet);
		SetOfIntegers intersection = firstSet.intersection(secondSet);
		
		 System.out.println("Set A contains elements: ");
		 System.out.println(firstSet.toString());
		
		 System.out.println("Set B contains elements: ");
		 System.out.println(secondSet.toString());
		 
		 System.out.println("Union of Set A and Set B contains elements:" );   
     	System.out.println( union.toString() );   
     	System.out.println(   
     	"Intersection of Set A and Set B contains elements:" );   
     	System.out.println( intersection.toString() ); 
     	
     // test whether two sets are equal   
        if ( firstSet.isEqualTo( secondSet ) )   
           System.out.println( "Set A is equal to set B" );   
        else   
           System.out.println( "Set A is not equal to set B" );   
     
        // test insert and delete   
        System.out.println( "Inserting 25 into set A..." );   
        firstSet.insertElement( 25 );   
        System.out.println( "Set A now contains elements:" );   
        System.out.println( secondSet.toString() );   
	}
	
	private static SetOfIntegers inputSet()
	{
		Scanner input = new Scanner(System.in);
		SetOfIntegers fend = new SetOfIntegers();
		
	      System.out.print( "Enter number (-1 to end): " );   
	      int number = input.nextInt();   
	        
	      while ( number != -1 )   
	      {   
	         fend.insertElement( number );   
	   
	         System.out.print( "Enter number (-1 to end): " );   
	         number = input.nextInt();   
	      } // end while   
	        
	      return fend;  
	      
	   }
	
	
	}


