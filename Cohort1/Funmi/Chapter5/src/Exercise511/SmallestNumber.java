package Exercise511;
import java.util.Scanner;
public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner input = new Scanner(System.in);
		       System.out.println("Enter all the VAlue here: ");
		        int number = 0;
	
		       
		        number = input.nextInt();
		        int smaller = number;
		    
		        while(input.hasNext()){
		        //System.out.println("Enter the numbers: ");
		        number = input.nextInt();

		        if(number < smaller){
		        smaller = number;
		        }
		        
		        
		        }
		           System.out.print("The smallest number of all the values inputed are: " + smaller + "\n");
		           input.close();     
		        }
		    }
		
