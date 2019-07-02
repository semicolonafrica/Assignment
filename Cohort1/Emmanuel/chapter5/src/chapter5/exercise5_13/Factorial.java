/**
 * 
 */
package chapter5.exercise5_13;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Factorial {

	
	public static void main(String[] args) {
		  long c = 1;
	        int counter = 1;
	        
	        System.out.println("Number\t Factorial\t");

	        while (counter <= 20){
	             
	            while (counter <=20){
	       
	                c = c * counter;
	                
	                System.out.println(counter+"!"+"\t" +" "+ c+"\t"); 
	                System.out.println();
	                
	                counter++; 
	            
	        } 
	        
	        counter++;      
	        
	 } 

	}

}
