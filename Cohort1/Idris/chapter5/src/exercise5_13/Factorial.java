package exercise5_13;

public class Factorial {
	 public void calculateFactor(){ 
		 
	        long fact;int valueB;
	        System.out.println("\tNumber"+"\tfactorial");
	        
	        for(int counter = 1;counter<=20;counter++){
	            fact=counter;
	            for(int num = 1;num<counter;num++){
	                valueB = counter -num;
	                fact*=valueB;
	            }
	            System.out.println("\t"+counter+"!\t"+fact);
	        }
	    }
}
