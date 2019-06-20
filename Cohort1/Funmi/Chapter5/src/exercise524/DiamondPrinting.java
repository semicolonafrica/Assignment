package exercise524;

public class DiamondPrinting {


	    
	    public void totalDiamondVal(){
	    
	        int a = 5;
	        int b = 1;
	        


	        //System.out.println("Enter the number of rows");
	        //n = input.nextInt();
	       for(int n = 1; n<=9; n++){

	        for(int j = a; j > 0; j--){
	            System.out.print(" ");
	        }
	        for(int i = b; i > 0; i--){
	            System.out.print("*");
	            
	        }
	         System.out.println();
	           if (n>4){

	               b -=2;
	               a +=1; 
	           }
	           else{
	               b +=2;
	               a -=1;
	    
	               }
	        

	            }
	        
	    }
	    public static void main(String[] args){
	        DiamondPrinting val = new DiamondPrinting();
	        val.totalDiamondVal(); 
	    }
	    
	}

	

