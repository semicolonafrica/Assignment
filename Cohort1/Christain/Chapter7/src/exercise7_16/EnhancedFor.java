package exercise7_16;

public class EnhancedFor {

	public static void main(String[] args) {
		
		int total = 0;
		for(String b : args)
		total +=  Integer.parseInt(b);
		
		System.out.print(total);
			
	}

}

