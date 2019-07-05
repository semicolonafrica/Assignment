package exercise525;
import java.util.Scanner;
public class DiamoondModified {
	
	
	    public void totalDiamondVal(){
	       Scanner input = new Scanner(System.in);
	     
	        int b = 1;
	        


	        System.out.println("Enter the number of rows in oddnumbers: ");
	       int k = input.nextInt();
	       int core = k/2;
	       int a = k;


	       for(int n = 1; n<=k; n++){

	        for(int j = a; j > 0; j--){
	            System.out.print(" ");
	        }
	        for(int i = b; i > 0; i--){
	            System.out.print("*");
	            
	        }
	         System.out.println();
	           if (n>core){

	               b -=2;
	               a +=1; 
	           }
	           else{
	               b +=2;
	               a -=1;
	    
	               }
	        
	           input.close();
	            }
	        
	    }
	    public static void main(String[] args){
	    	DiamoondModified  val2 = new DiamoondModified ();
	        val2.totalDiamondVal(); 
	    }
	}

