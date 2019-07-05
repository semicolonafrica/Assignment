package chapter.exercise7_11;
	
import java.security.SecureRandom;
	public class Aray {

	    public static void setElements () {

	        int [] array = {2,3,4,56,7,86,3,67,243,3};

	        for (int count = 0; count < array.length; count++){
	            System.out.print(array[count] = 0);
	        

	        }
	        System.out.println();
	    }

	    public static void  addElements(){
	        int [] bonus = {28,3,45,6,767,8,9,9,8,9,6,5,342,2,100};

	        for(int counter = 0; counter < bonus.length; counter++){
	            System.out.println(bonus[counter] += 1);
	        }
	    }

	    public static void  displaycoloumn() {
	            SecureRandom random = new SecureRandom();
	        int numbers = 1+ random.nextInt(6);
	        int [] bestScores = new int [6];
	        
	        
	        System.out.printf("%s%8s\n", "Index", "Value");
	        for(int count=0; count < bestScores.length; count++){
	        	bestScores[count] = numbers;
	        	 System.out.printf("%5d%8d\n", count,bestScores[numbers]);
	     
	    }
	        
	       
	    }


	    public static void main(String [] args){
	     
	        Aray.displaycoloumn();
	        Aray.setElements ();
	        Aray.addElements();
	    }
	    
	    }
	
	

