/**
 * 
 */
package chaapter5.exercise6_24;

/**
 * @author Emmanuel Akinbode
 *
 */
public class PerfectNumber {
	
	 public static void perfectNumber(int num){
	        String c = " ";
	        int d = 0;
	        
	        int remainder = 0;
	        int counter = 1;
	 
	        
	       while(counter < num) {
	        	// for(int i =1; i < num/2 ; i++)
	 	         
	        		 remainder = num % counter;
	 	        
	 	            if(remainder == 0)
	 	            {
	 	              //System.out.println(i);
	 	               d = d + counter;
	 	               c = c + " " + counter + ",";  	               
	 	             } 
	 	           counter++;  
	 	        }
	        	 
	        
	       
	        
	        if(d == num) 
	        {
         	   System.out.println("Factors of " + d + " are " + c);
         	   System.out.println("Number is a perfect number");
         	  System.out.println();
            }else 
            {
            	System.out.println();
               System.out.println("Factors of " + d + " are " + c);
         	   System.out.println("Number is not a perfect number");
            }
	    
	 }
	 
	 public static void displayPerfectNumbers(int num) {
		 
		 //int number;
		 
		 for(int i = 1; i <= 1000; i++) {
			 
			 perfectNumber(i);
		 }
	 }
}
