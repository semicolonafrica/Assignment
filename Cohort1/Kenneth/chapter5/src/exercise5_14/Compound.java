/**
 * 
 */
package exercise5_14;

/**
 * @author ken_granero
 *
 */
import java.util.Scanner;
public class Compound {
	
	
	public void calculateInterest() {
	
    Scanner insert = new Scanner(System.in);

	
	    double rate  =0.05 + 1;
	    int percent = 5;
	    double total = 1;
	    int years = 10;
	    double invest = 1000;
	    
	    for(int counter = 1; counter <= 6; counter++) {
		        System.out.println("Rate: "+"\n" +percent +"%" );
		        System.out.printf("%n%s%20s%n","Year", "Total Amount");
		       for(int i = 1; i <= years; i++) {
		    	   
		    	   total *= rate;
		    	   double a = invest * total;
		    	   
			        System.out.printf("%d %,20.2f%n",i,a);
			        if(i == years) {
			        	total = 1;
			        }
		       }
		       rate+=0.01;
		       percent++;
	    }
  
    
	    insert.close();
	}

}


