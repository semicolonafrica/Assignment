package exercise6_24;



public class PerfectNumbers {
     public static int isPerfect(int value) {
    	//int value =0;
    	int sum = 0;
    	String factors = "";
    	 for(int i=1;i < value;i++) {

    		 if (value % i==0) {
    			sum =sum + i;
    			
    			//factors = factors + "," + i;
    			
    			System.out.println(i);
    		 }
    	 }
    	 if(sum==value) {
    		 System.out.println("the number is a perfect number");
    	 }else {
    		 System.out.println("is not a perfect number");
    	 }
    	 return value;
     }
}
