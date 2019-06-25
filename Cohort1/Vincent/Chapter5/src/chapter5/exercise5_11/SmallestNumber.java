package chapter5.exercise5_11;

//Write an application that finds the smallest of several integers.
//Assume that the first value read specifies the number of values to input from the user.

public class SmallestNumber {
	
	public static void findSmallest() {
		
		String store = "13463";
		
		int total = Integer.parseInt(store);
		
			 total = Math.min(total,100);
			
			System.out.println(total);
		
	}
	// the both method can display the lowest number;
	
	public static void getSmallest() {
		
		int count;
		
		for(count =1; count <= 10; count++) {
			
			System.out.println(count);
			
			if( count <= 1) {
				System.out.println("The smallest number is: 1");	
			
			}
		
		}
	}

}
