package exercise7_16;

public class EnhacedForStatement {
	
	public static  void main(String[] args)
	{
		double total = 0.0;
		for (String num : args) {
			
			total += Integer.parseInt(num);	
			System.out.println("value: " + num);
		}
		System.out.printf("%s%.2f%n","The Total Value is : ",total);
		
	}
	
}	